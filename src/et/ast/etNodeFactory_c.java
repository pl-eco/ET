package et.ast;

import et.ast.mswitch.MSwitch_c;
import et.ast.mswitch.MSwitchGroup;
import et.types.EnergyFlags;
import polyglot.ast.*;
import polyglot.ext.jl5.ast.AnnotationElem;
import polyglot.ext.jl5.ast.JL5Import;
import polyglot.ext.jl5.ast.JL5MethodDecl;
import polyglot.ext.jl5.ast.JL5MethodDecl_c;
import polyglot.ext.jl5.ast.ParamTypeNode;
import polyglot.parse.Name;
import polyglot.types.Flags;
import polyglot.util.*;

import java.util.*;

import cs.ast.csNodeFactory_c;

/**
 * NodeFactory for et extension.
 */
public class etNodeFactory_c extends csNodeFactory_c implements etNodeFactory {
	
	@Override
	public Using_c Using(Position pos, Expr obj, UsingBlock_c consequent, UsingBlock_c alternative) {
		return new Using_c(pos, obj, consequent, alternative);
	}
	
	@Override
	public UsingBlock_c UsingBlock(Block block, UsingBlock_c.Type type) {
		return new UsingBlock_c(block, type);
	}
	
	public ClassDecl ClassDecl(Position pos, Flags flags,
			List<AnnotationElem> annotations, Id name, TypeNode superType,
			List<TypeNode> interfaces, ClassBody body,
			List<ParamTypeNode> paramTypes, EnergyFlags eFlags) {
		if (pos == null) {
			pos = body.position();
		}

		ClassDecl n = new ECMClassDecl_c(pos, flags, annotations, name,
				superType, interfaces, body, paramTypes, eFlags);
		return n;
	}

	@Override
	public Local Local(Position pos, Id name) {
		Local n = new ETLocal_c(pos, name);
		return n;
	}


	public MPattern_Init_c MPattern_Init(Position pos,
			List<MPatternElement> list) {
		MPattern_Init_c pattern = new MPattern_Init_c(pos, list);
		return pattern;
	}

	public MPatternElement MPatternElement(Position pos, String label, Expr expr) {
		MPatternElement n = new MPatternElement(pos, label, expr);
		return n;
	}

	public MPattern MPattern(Position pos, TypeNode innerType) {
		MPattern pattern = new MPattern(pos, innerType);
		return pattern;
	}

	public MPatternApp MPatternApp(Position pos, String modeV, Expr pattern) {
		MPatternApp app = new MPatternApp(pos, modeV, pattern);
		return app;
	}

	public Attribute_c Attribute(Position pos, Expr obj) {
		Attribute_c attribute = new Attribute_c(pos, obj);
		return attribute;
	}

	public AttributeDecl AttributeDecl(Position pos, TypeNode returnType,
			Id name) {
		AttributeDecl at = new AttributeDecl(pos, returnType, name);
		return at;
	}

	@Override
	public Field Field(Position pos, Receiver target, Id name) {
		Field n = new ETField_c(pos, target, name);
		return n;
	}

	public Adapt_c Adapt(Position pos, String s, Expr e) {
		Adapt_c n = new Adapt_c(pos, s, e);
		return n;
	}

	public Reconstruct_c Reconstruct(Position pos, Expr e, Expr modeExpr) {
		Reconstruct_c n = new Reconstruct_c(pos, e, modeExpr);
		return n;
	}

	public ReconstructDecl ReconstructDecl(Position pos, TypeNode returnType,
			Id name) {
		ReconstructDecl r = new ReconstructDecl(pos, returnType, name);
		return r;
	}

	@Override
	public Return Return(Position pos, Expr expr) {
		Return n = new ECMReturn_c(pos, expr);
		return n;
	}

	//this is not an override of the MethodDecl method
	public JL5MethodDecl MethodDecl(Position pos, Flags flags,
			TypeNode returnType, Id name, List<Formal> formals,
			List<TypeNode> throwTypes, Block body, List<String> whereOrder) {
		JL5MethodDecl n = MethodDecl(pos, flags, null, returnType, name,
				formals, throwTypes, body, null, whereOrder);
		return n;
	}

	//this is not an override of the MethodDecl method
	public JL5MethodDecl MethodDecl(Position pos, Flags flags,
			List<AnnotationElem> annotations, TypeNode returnType, Id name,
			List<Formal> formals, List<TypeNode> throwTypes, Block body,
			List<ParamTypeNode> typeParams, List<String> whereOrder) {
		JL5MethodDecl n;
		if (typeParams == null) {
			n = new ECMMethodDecl_c(pos, flags, annotations, returnType, name,
					formals, throwTypes, body, whereOrder);
		} else {
			n = new ECMMethodDecl_c(pos, flags, annotations, returnType, name,
					formals, throwTypes, body, typeParams, whereOrder);
		}
		n = (JL5MethodDecl) n.ext(extFactory().extMethodDecl());
		n = (JL5MethodDecl) n.del(delFactory().delMethodDecl());
		return n;
	}

	public Call Call(Position pos, Receiver target, List<TypeNode> typeArgs,
			Id name, List<Expr> args) {
		Call n = new ECMCall_c(pos, target,
				CollectionUtil.nonNullList(typeArgs), name,
				CollectionUtil.nonNullList(args));
		// n = (Call)n.ext(extFactory.extCall());
		// n = (Call)n.del(delFactory.delCall());
		return n;
	}

	public ModeLit_c ModeLit(Position pos, String value) {
		ModeLit_c n = new ModeLit_c(pos, value);
		// n = (StringLit)n.ext(extFactory.extStringLit());
		// n = (StringLit)n.del(delFactory.delStringLit());
		return n;
	}

	public MSwitch_c MSwitch(Position pos, Expr expr, List elements) {
		MSwitch_c n = new MSwitch_c(pos, expr,
				CollectionUtil.nonNullList(elements));
		// n = (Switch) n.ext(extFactory.extSwitch());
		// n = (Switch) n.del(delFactory.delSwitch());
		return n;
	}

	public MSwitchGroup MSwitchGroup(ModeLit_c label, Expr expr, Position pos) {
		MSwitchGroup n = new MSwitchGroup(label, expr, pos);
		// n = (Switch) n.ext(extFactory.extSwitch());
		// n = (Switch) n.del(delFactory.delSwitch());
		return n;
	}

	@Override
	public SourceFile SourceFile(Position pos, PackageNode packageName,
			List<Import> imports, List<TopLevelDecl> decls) {
		SourceFile n = new ECMSourceFile_c(pos, packageName,
				CollectionUtil.nonNullList(imports),
				CollectionUtil.nonNullList(decls));
		return n;
	}
}
