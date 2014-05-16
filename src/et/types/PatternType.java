package et.types;

import java.util.LinkedList;
import java.util.List;

import polyglot.ext.jl5.types.AnnotationTypeElemInstance;
import polyglot.ext.jl5.types.EnumInstance;
import polyglot.ext.jl5.types.JL5MethodInstance;
import polyglot.ext.jl5.types.JL5Subst;
import polyglot.ext.jl5.types.RetainedAnnotations;
import polyglot.ext.jl5.types.TypeVariable;
import polyglot.ext.param.types.PClass;
import polyglot.frontend.Job;
import polyglot.frontend.Source;
import polyglot.types.ArrayType;
import polyglot.types.ClassType;
import polyglot.types.ConstructorInstance;
import polyglot.types.Declaration;
import polyglot.types.FieldInstance;
import polyglot.types.Flags;
import polyglot.types.LazyInitializer;
import polyglot.types.MemberInstance;
import polyglot.types.MethodInstance;
import polyglot.types.NullType;
import polyglot.types.Package;
import polyglot.types.PrimitiveType;
import polyglot.types.ReferenceType;
import polyglot.types.Resolver;
import polyglot.types.Type;
import polyglot.types.TypeObject;
import polyglot.types.TypeSystem;
import polyglot.types.Type_c;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import cs.data.id.ID;
import cs.types.CSNonGenericType;

public class PatternType extends Type_c {
	private Type base = null;

	public void base(Type base) {
		this.base = base;
	}

	public Type base() {
		return base;
	}

	@Override
	public String translate(Resolver c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
