package net.javacoding.jspider.api.event.engine;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Summary;

import et.util.MyUtility;

public class SpideringSummaryEvent
extends net.javacoding.jspider.api.event.engine.EngineRelatedEvent
{

    protected net.javacoding.jspider.api.model.Summary
      summary;
    
    public SpideringSummaryEvent(net.javacoding.jspider.api.model.Summary summary) {
        super();
        this.
          summary =
          summary;
    }
    
    public java.lang.String
      getComment(
      ) {
        return this.
                 toString();
    }
    
    public java.lang.String
      toString(
      ) {
        net.javacoding.jspider.api.model.Summary s =
          this.
            summary;
        java.lang.StringBuffer sb =
          new java.lang.StringBuffer(
          );
        sb.
          append(
          "\nSPIDERING SUMMARY : ");
        sb.
          append(
          "\nknown urls ............. : " +
          s.
            getKnown());
        sb.
          append(
          "\n");
        sb.
          append(
          "\n  visited urls ........... : " +
          s.
            getVisited());
        sb.
          append(
          "\n    parsed urls ............ : " +
          s.
            getParsed());
        sb.
          append(
          "\n    parse ignored urls ..... : " +
          s.
            getIgnoredForParsing());
        sb.
          append(
          "\n    parse error urls ....... : " +
          s.
            getParseErrors());
        sb.
          append(
          "\n");
        sb.
          append(
          "\n  not visited urls ....... : " +
          s.
            getNotVisited());
        sb.
          append(
          "\n    fetching ignored urls .. : " +
          s.
            getIgnoredForFetching());
        sb.
          append(
          "\n    forbidden urls ......... : " +
          s.
            getForbidden());
        sb.
          append(
          "\n    fetch error urls ....... : " +
          s.
            getFetchErrors());
        sb.
          append(
          "\n");
        sb.
          append(
          "\n  not yet  visited urls .. : " +
          s.
            getUnvisited());
        return sb.
                 toString();
    }
    
    public net.javacoding.jspider.api.model.Summary
      getSummary(
      ) {
        return summary;
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWf88edz3bi78TETuykhsSKfWff+auxELVsR3Zy" +
       "iV2fkxLX1XW9O+ds\nsre72Z07n90SQJSkLVKhamlBCq2AokhVgYqQ8geIEL" +
       "XloyUS+I+2tGoFSlUVQaoihBpBUXgzs3u7\nt3eOi+pa2r3xzJt5b977/d68" +
       "nWeuoXLTQK2iGSLLOjZDo/FpwTCxNKoIpjkLXQnxxfLg9PmDqlaC\nfDFUIk" +
       "sE1cREMywJRAjLUnhybDhroHZdU5YXFY1Y6xSssu+WD5d+f/ZASymqmUM1sh" +
       "onApHFUU0l\nOEvmUHUKpxawYY5IEpbmUJ2KsRTHhiwo8goIauocqjflRVUg" +
       "aQObM9jUlAwVrDfTOjaYTrszhqpF\nTTWJkRaJZpgE1cZOCBkhnCayEo7JJh" +
       "mOIX9SxopknkKnUWkMlScVYREEt8TsXYTZiuH9tB/EK2Uw\n00gKIranlJ2U" +
       "VfBEm3dGbscdB0EApgZSmBzXcqrKVAE6UD03SRHUxXCcGLK6CKLlWhq0ELRt" +
       "zUVB\nqEIXxJPCIk4Q1OyVm+ZDIBVkbqFTCGryirGVIGbbPDFzRWvKX/3fB6" +
       "c/aGcxL5OwqFD7AzBph2fS\nDE5iA6si5hOvp0OPTh5Lt5YgBMJNHmEuM/Lp" +
       "nx2JvXupjcu0FJGZWjiBRZIQPxxo3b468nawlJpR\noWumTKGQt3MW1WlrZD" +
       "irA5q35FakgyF78Fczvz72pafx30pQxSTyi5qSTqmTKIhVadRqB6Adk1XM\n" +
       "e6eSSROTSVSmsC6/xv4HdyRlBVN3+KGtC+Q4a2d1hFAAHh88UcT/gvRF0Na4" +
       "LkuYRjmeTqUEY3k8\ng1US0gn6nIrJPIWCqEkwPH/CZJLzgi7PYyo0j9VFUD" +
       "+/xgpZqrtmyeejJPZSUAG8TmgKzEuI56++\ndO/4wQfu5wGlILSsJuizYEPI" +
       "sSFk2RACG0LMhhC3IVTUBuTzMe1b851OoyhRsv39J8O1D3Wbz5Wg\n0jkUlF" +
       "OpNBEWFAwkFRRFW8JSgjCU1rkYwYAIKK5eAECDvoQCCzECgZczBtrlBa5D90" +
       "loCYDG1dM3\n/vBeYukCxRjFRCNdnZsGET7JbavujN914O77d5VSoaUyGjwQ" +
       "7Vh/9YT43oOHLrzy8pt7HIIQ1FHA\n28KZlHde86cNTcQS5DVn+cf/PfH+I+" +
       "W3XixBZUBmSGdEgAhAbtjh1ZHHv2E7l1FnwcyqpGakBIUO\n2Qmokhw3tCWn" +
       "hyFoE2vXggOq4CmHp8ZC8Cb6ooP19NXA8Ub96dkDy5TXv+LvefUXVS8yp9hJ" +
       "tcaV\nfeOYcIrWOeGYNTCG/je/Nf3IN6+dvZPFwgoGQX49vaDIYpbZt9UHsW" +
       "8oki5CzY2PPtZ57lU72A3O\n6iOGISzTWGe/vLr9278RvgOpBChtyiuYMdaX" +
       "C3sztpccHz3EExBPV/eeu3qm889/umKlNNdR6Uj9\nNXFf+rmvXlotoS4Owq" +
       "ElmIdtjrFDk7Z87CCBMDLI054g82clp3EvsWb2Dg32g0H1oIkesiFZCsU0\n" +
       "UVAmx757uWr14fTAAW7KJpfA5Fgi23blB5032pkJlka/K2ta/wcygnHYoT/9" +
       "iRA08THz0L7eaFe0\nv7u/h6CAyUdYyBoJ2nOT9JLSJKyErKXsINN3F2t3U/" +
       "CxACHmoV2WCM0B3my3nx7oNoFSC/f86/kn\nKts5IOic1lycW9xxzpuVEE+t" +
       "nIuuxu+QuX+9R51HeOWXR564foW8xdDucJRq25ktNPCo4EofQ69k\n6vzPPp" +
       "kqQYE5VMvKFUElRwUlTbkwBzgxR63OGMTZPZ5fPHAIDudyUKs3P7jUerODcw" +
       "xAOx+STkLY\nDM8OKzEg+9eVEHyIYWicTehg7905+gZ1QyNgH5ayHmCEOeYP" +
       "ujDf58E8d/fYbbdefvvaj+UPGK4r\nWd02QmdYhgdZj4tspZpu0grBVaJaK3" +
       "VM6eYwU9tnqx0c7OvZAPT39XX19ndHgEjVsxOT8ZC1U6oq\n5mz8NJQmhfuj" +
       "Vlm+RfUMd5tZ+qLhDY2r6ZR7EI7rspnxkTG68hDLxWw/n7F44VCn1aIN+HT7" +
       "WmUe\nK1HPfv4f1WeEF+7ikK/PP8Wp+v4nX8Odt1WLRSqHINH0bgU8pDi89G" +
       "o7xMpfG4I1d7T9Zf/A+S94\niVlG6xc3MfOnJcTLP7r0Rv9rr98HVsyhwOGp" +
       "+OhIbBwMbrupuoRYl2m5vfS4/FuGHosjBUV7/qTh\nfGZUGhi+OdTZPH605x" +
       "2YlB91VpTqih2Yrhitkd7WzX3A+8pFTEa1VAow5+aQ4uLQABuI0ldqI7L6\n" +
       "YFdvb3cUKNLg6N5ttnOX2Bm+1sEr/5ZBbGQhz0et8DRZPmr6hHwEvK8gGrfB" +
       "7aEVl4cGHQ/dswEe\nivRSD0WGoIC1Nef8Q3WcKuaLnfDstXyx9xPyxRc5Xu" +
       "KFOfeM442hXscbZzciD0YZXqIcL9Zgnj+G\nivmjC56w5Y/w/+cPu35z7e/r" +
       "rv1FnP19YyP2N9gViXb3wf4CGRnKKs2wOdC97kcUW+Mon7V++L4G\nta8gil" +
       "gn3pJl2pBTUNBlrA/ui3P/7JHe2TvG83ez+yLHLTgRuYE7Gt59nxcr+QVqkV" +
       "LHo+ThHU+9\nc+HqTCM/A/jVxy0Ftw/uOfz6g22lWqen0M6baWDSL+zd+czp" +
       "mbcWSiwX3AlnXUaj901+Zm8PgiKi\nqWhoaNHfXHADxe9JxF2rd+95Xq/7Hf" +
       "uWyt1lVEBpnEwrirsGcrX9uoGTMrOjgldEHFxPEbT7I34v\ng928wQL8fT7/" +
       "PEHt680nqJz9uuc9TdC2tecRVApvt/wPCdpSXB6wa7Xc8s8StDlfHvKH849b" +
       "9AJo\nA1Ha/KnuJt5FV5qN6jYz9n3U64Vx9jODFQHqRRZWiptGV8UU17Eo0+" +
       "+g7Pd+Xnb7Q3/8DzvVAyK/\nRKQXZ1D0MWKGR1RBWTZZFU3H6GWCmDbgQ5mw" +
       "8seKcpXJV+QXZS3umjGnq2P22PR4YdnYuxHpZKgr\nEumODADQadn4se9ioM" +
       "D8VDF3sS24y0i6mSOW1v8BL3c4kwMWAAA=");
}
