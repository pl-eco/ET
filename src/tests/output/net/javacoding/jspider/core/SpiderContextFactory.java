package net.javacoding.jspider.core;

import net.javacoding.jspider.api.event.EventSink;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.impl.EventDispatcherImpl;

import et.util.MyUtility;
import net.javacoding.jspider.core.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.StorageFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.throttle.ThrottleFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class SpiderContextFactory {

    
    public static net.javacoding.jspider.core.SpiderContext createContext(
      java.net.URL baseURL) {
        EventSink[] sinks =
          new net.javacoding.jspider.core.impl.PluginFactory().createPlugins();
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.getConfiguration().getPluginsConfiguration();
        net.javacoding.jspider.core.util.config.PropertySet filterProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.CONFIG_FILTER, props);
        net.javacoding.jspider.core.dispatch.EventDispatcher dispatcher =
          new net.javacoding.jspider.core.dispatch.impl.EventDispatcherImpl(
          "Global Event Dispatcher", sinks, filterProps);
        dispatcher.initialize();
        net.javacoding.jspider.core.storage.Storage storage =
          new net.javacoding.jspider.core.storage.StorageFactory(
            ).createStorage();
        net.javacoding.jspider.core.throttle.ThrottleFactory throttleFactory =
          new net.javacoding.jspider.core.throttle.ThrottleFactory();
        net.javacoding.jspider.core.SpiderContext context =
          new net.javacoding.jspider.core.impl.SpiderContextImpl(
          baseURL, dispatcher, throttleFactory, storage);
        context.setAgent(
          new net.javacoding.jspider.core.impl.AgentImpl(context));
        return context;
    }
    
    public SpiderContextFactory() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1360121549918L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJVWXWwUVRS++9Pdbllsu5TS0EKbgoZiOwsIFdnE2Cxt2LJt" +
       "1y5EqCXL3Zm722ln\nZ8aZu+0WkWhEQB5MDPiXoMYHQ2KMDxLxxQQJ4j+J6Y" +
       "OghkSDDxqF6IORGAyee2f2fwFpOrN37j3/\n5zvn3HevojrTQB2iKdB5nZhC" +
       "OB7DhkmksIJNcwdsJcTzdb7Yye2q5kSOKHLKEkWNUdEMSpjioCwF\nI1tDOQ" +
       "N16Zoyn1Y0asupkrJl1Y25rw8Pt7tQ4wRqlNU4xVQWw5pKSY5OIH+GZJLEMA" +
       "ckiUgTqFkl\nRIoTQ8aKvA8INXUCBUw5rWKaNYg5TkxNmWWEATOrE4PrzG9G" +
       "kV/UVJMaWZFqhklRU3Qaz+JglspK\nMCqbNBRFnpRMFMl8Ah1AriiqSyk4DY" +
       "St0bwXQS4xOMT2gbxBBjONFBZJnsU9I6sQic5KjoLHq7cD\nAbB6M4ROaQVV" +
       "bhXDBgpYJilYTQfj1JDVNJDWaVnQQtHyWwoFonodizM4TRIUtVXSxawjoPLx" +
       "sDAW\nipZWknFJkLPlFTkrydaYx//v0djfXTznbomICrPfC0wrK5jGSYoYRB" +
       "WJxXg9KxyP7M52OBEC4qUV\nxBbNwL0f7oz+cqbTommvQTOWnCYiTYg3+jtW" +
       "LAz87HMxM+p1zZQZFMo851mN2SehnA5obi1IZIdC\n/vDj8U93P/0O+c2J6i" +
       "PII2pKNqNGkI+oUthee2EdlVVi7Y6lUiahEeRW+JZH498QjpSsEBYOD6x1\n" +
       "TKf4OqcjhLzwOOBZi6y/VvYCXMV1WSKGDfYhzHA5L+gUbVAJnWRIEDUJMDA5" +
       "bXLCSVEzyGRtphzT\n1jjncLCyrSw6BRC6TVOALSGevPLl/sHtzx+xUshgZ9" +
       "tJ0TpQKxTVCrZagakVaqlFDgdXuKw8sixV\nEquo398PNb3QZ552ItcE8smZ" +
       "TJbipEKgErGiaHNESlAOxeYS2HO0AVT9SUAtWJFQQBCvEgjlrIG6\nK9FZrO" +
       "kIrDBAbuHAzW+uJeZOMSCxxLcw6ZZpkMYZyzZ/T3zP8N4j3S5GNOdmGQLS1X" +
       "eWnhCvHR05\n9e1Xl9cUq4Ci1VXFWc3JiqvS/JihiUSC5lUU/8o/2/44VvfQ" +
       "B07khoqFnkUxIA0awMpKHWVFFso3\nLBYs4FyU0owMVthRvss00ClDmyvucN" +
       "AsZq9mCz8sWBUG8l53/VnPuosfLTrPPc63xcaS/hkn1Cqy\n5mKsdxiEwP7l" +
       "V2PHXrp6+HEeaDvSFHn0bFKRxRw3ZJkDErukRsELbS3HX+45cTGfySVF6QOG" +
       "gedZ\nInPPLKx47TP8OjQDKEpT3kd4zSGuCeUVsPf9fN1bcsi+u20SBq7Kyh" +
       "li4yCfmUzyyb/OvdHQZRnD\neDpKdazi7/tsD9l6TV5yUXmBw0ArbtVm+Yg4" +
       "vOtP/yH8yR6rGQbKC2xQzWY2vXmJ9DziF2vUsY9q\nep9CZolS9KxS2wgfP3" +
       "nXGh/r/Gmo/+RTla7xbkLyPIPhkXK2hHj2vTM/bLr0/UGwYgJ5R8fi4YHo\n" +
       "IBjceVt1CbF5tv1R15T8uZMPP6uEqoZmOVOo1E3AskFg5qssYGzHx3PZxW1v" +
       "AssD8GyBp81uufyX\nHQbYa4kN96q8OXneAJ4mv4fURo+jEJu20thY08maZf" +
       "tPXDnU8+N3F+x5V3KPKlL9mjiYPf3cmQUe\nAx/caLA5WvQPblRs5eC3DCh/" +
       "3iqLnjZYHT9KkZdzbn4AzAmAHnb/EmRJiGoiViJb3zq7aOHFbP+w\nZcjiEo" +
       "LI1kSu88LbPTe7uAG2Pk/JQLW/vbPYGC3ii/2MUBS6+xm1ZcPG3o39fZseBK" +
       "OT2CQ7x6M8\npi0U+Xlhs/kDm3eu2TAFVwyCKbF1cKphKya7CjHZwLdH2Ws3" +
       "Rb3C5C1sHrbsZRb2967f3Ne/fi1F\nD9/tNBSqLQLPev63GAT/LbUEs87XVn" +
       "WRtq57YvfC3jXn9OYv+LQoXMnqIY2prKKUFExp8Xh0g6Rk\nHq16awhYocMU" +
       "td/GXorc7Ie7ttfigMtua20OyIK9KqVPU3RPOT1FDcWPUtJpilxAypYzej6c" +
       "TRwo\n7KYgWJWU0/8Dc058Ja0MAAA=");
}
