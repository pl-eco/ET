package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.*;

import et.util.MyUtility;

class TypeTranslator {

    
    public static net.javacoding.jspider.core.model.ResourceInternal translate(
      net.javacoding.jspider.api.model.Resource resource) {
        return (net.javacoding.jspider.core.model.ResourceInternal) resource;
    }
    
    public static net.javacoding.jspider.core.model.ResourceReferenceInternal
      translate(
      net.javacoding.jspider.api.model.ResourceReference resourceReference) {
        return (net.javacoding.jspider.core.model.ResourceReferenceInternal)
                 resourceReference;
    }
    
    public static net.javacoding.jspider.core.model.SiteInternal translate(
      net.javacoding.jspider.api.model.Site site) {
        return (net.javacoding.jspider.core.model.SiteInternal) site;
    }
    
    public static net.javacoding.jspider.core.model.FolderInternal translate(
      net.javacoding.jspider.api.model.Folder folder) {
        return (net.javacoding.jspider.core.model.FolderInternal) folder;
    }
    
    public static net.javacoding.jspider.core.model.DecisionInternal translate(
      net.javacoding.jspider.api.model.Decision decision) {
        return (net.javacoding.jspider.core.model.DecisionInternal) decision;
    }
    
    public static net.javacoding.jspider.core.model.EMailAddressInternal
      translate(net.javacoding.jspider.api.model.EMailAddress address) {
        return (net.javacoding.jspider.core.model.EMailAddressInternal) address;
    }
    
    public TypeTranslator() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2wUVRS+28e2W4qlLa9QoA0PpdqddtvullpNqG0JCwtU" +
       "iqK1ZL2duVsGZmfG\nmbvtgkg0giAmJr41okYTgxrjD4kaExM0+FYSbaKiBO" +
       "Prh8ZH9IfRGA2ee2dmZ3bb7jaubDIzd2fO\nuef1ncfM8z+jctNAS0VToHt1" +
       "Ygp9Q4PYMInUp2DT3A634uJb5YHB45tUrQT5YqhEliiqiYlmq4Qp\nbpWl1m" +
       "h/T9pATbqm7B1TNGrvM2WXy1f+PfHh4Y0NpahmGNXI6hDFVBb7NJWSNB1G1U" +
       "mSHCWG2StJ\nRBpGtSoh0hAxZKzI+4BQU4dRnSmPqZimDGJuI6amjDPCOjOl" +
       "E4PLdG7GULWoqSY1UiLVDJOiebHd\neBy3pqistMZkk/bEkD8hE0Uyb0IHUG" +
       "kMlScUPAaEC2OOFa18x9b17D6QV8mgppHAInFYyvbIKnii\nMZcjY/GqTUAA" +
       "rBVJQndpGVFlKoYbqM5SScHqWOsQNWR1DEjLtRRIoWjJjJsCUaWOxT14jMQp" +
       "WpxL\nN2g9AqoAdwtjoWhBLhnfCWK2JCdmnmht9Vf/c3TwjyYe8zKJiArTvw" +
       "KYlucwbSMJYhBVJBbjnynh\n/uj1qaUlCAHxghxii6Z39SvXxL4/2WjRNExD" +
       "s3V0NxFpXPw7snTZZO93gVKmRqWumTKDQpblPKqD\n9pOetA5oXpjZkT0UnI" +
       "evb3v7+lufIz+WoMoo8ouakkqqURQgqtRnrytgHZNVYt3dmkiYhEZRmcJv\n" +
       "+TX+H9yRkBXC3OGHtY7pLr5O68j6+eBYaa8D7AQAZDZtN7BqKhggKegUdauE" +
       "jjAMiJoE0R/Zbeqy\nRIwRUTPIiAlEEMcROakrI7m8aSauZsLnY3mbm3UKQH" +
       "SDpsBOcfH4t+/vH9h05xErhgx3tqIUdYF0\nwZUu2NIFJl2wpQtMupAtHfl8" +
       "XO6ibA8zIoll1k8v9sy7O2i+XIJKh1FATiZTFI8qBDISK4o2QaQ4\n5ZCs9c" +
       "Cfow4gWz0K6AVl4gpsxLMFXDpuoBW5KHVzOworDNCbPHD+o1/iEycYoBgA5r" +
       "PdLdUgnHss\n3aqbh3ZuvPHIilJGNFHGIgWkqwrvHhd/Obr5xKcfnFvjZgNF" +
       "q6Yk6VROlmS56g8amkgkKGLu9g/9\nteHX+8q7XypBZZC5ULsoBsRBIVieKy" +
       "Mr2XqcwsWcBZxzEpqRxAp75FSbKrrL0CbcOxw7c9mp1oIR\nc1aOgrzm/Xm7" +
       "v+2z1+a8xS12ymONp44OEWolW63r6+0GIXD/3MOD9z3w8+EbuKMtT6M0l7/I" +
       "B/Gs\nnybfhcXz73+w+dhnTgDr3U17DQPvZfFL3za57JF38GNQCyAnTXkfsV" +
       "IuWwA7X8rXl3kesv8rbBKG\nqdy8Wc+6gROQ5OjNv596vKrJUobxLPVss9re" +
       "xRXkPAW9l81UUXk3OHzdb9V34Dd3WnWvLjuHBtRU\nMvzEGdK8rlqcJmMDVN" +
       "ODChknimtFrrTNvNM4ZtTsaPx6feT4Lblm+FndIA7PQN/mbLa4+MYLJ8+G\n" +
       "z3xxELQYRhVbtg719cYGQOHGvOLiYu14w9Wlu+R3S3ifs7JkSn/MZurxmglw" +
       "NQi0d5U5jN0JcIc3\ncd3ngeZ1cFwFxxy7uvIre1jHTvU2otl5JT9fbIGvhC" +
       "K/nhpVZBEWJh87pkeLL1MVFnv9YzUjq3Xt\nP/btHc1ffX7abm+escml+iF+" +
       "MPXyoZOT3A8BGGCwucW1EQYotvLxoQKynFdE19oqq75vpKiKc4ba\nQu0R0K" +
       "gORLGJS5AlIaaJWIn2P/nGnMl7UpGNli5zPQTR/ni68fTTzeebuA62SL+nhd" +
       "r/K8axscWF\nGbtsouiq/9ybLg+FWjq7gpFOiiphTNNShj0xzaeoeYaeg3VZ" +
       "SGoSUYRtNkfhXF7HEsKWawnYYPnt\nWq/fwvxJjJ12FGtVaG0wEoG5LSP1Er" +
       "PJQqtjX3u+npptYJRNkypWEOe9MgvgO+GosQFeM0uAs3U/\nOw3kB7bHUaLX" +
       "Ud2uo6TiHBVuCUeC3SHo8E74My2rkJ+m4iDDWhgQO2cCRNJr51rXTrVYOwEQ" +
       "3R15\nAdEze0BkLM2HjAgc9TYy6i8cMvZ5PNbR7nrs5uI81t3S2REMt1PWum" +
       "kGDKsLgmEIqAvHn84U/4Ne\na0KuNYeKtQbiH+7MG3+hcPyZcflCfgUci+yQ" +
       "L7pwIb/H6yRP1by3KCe1d7R0hoPhtdB1E/yVxHHM\nJQWDvp7TFw77XTOF/V" +
       "GvRZ2uRceKtYj1gba8YW8rHHbLvHyBZ2NOgx34hgsX+Ge8bvJUx2eLc1NX\n" +
       "ZgiAKVA2Yd6Y/RDQb3MUDv5TMwX/Ra9VXa5VJ4q16n8ZAhwD84V/AxyNdvgb" +
       "L1z4T3oc1ekpjq8X\n5aiOUEs4FOyCIaACSxLMAabjnWDB6A9sxrLSa3EVRs" +
       "CrMyHgPa9hba5h7xdrGCCgqz0vAiKFEeA1\nMoOCNEUXZUtkL8KLp3xWtT7+" +
       "iSsmb1xzSq99j38zyHygq4QRP5FSFM87lff9yq8bJCFzD1VanwIs\nd01StG" +
       "a2X4SggbMLN/dji/0TilbOgh3wYK+8zGcoasjDDOLYxctxlqKF03OABHvlpf" +
       "8SPJtND+hw\n/3hJv6aoFEjZ8hvdieg8/jGCfasSrJe8tP4vbEHvnDcXAAA=");
}
