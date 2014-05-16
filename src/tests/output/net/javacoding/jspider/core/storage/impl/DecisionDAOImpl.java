package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.core.storage.DecisionDAO;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.DecisionDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.ResourceInternal;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;

class DecisionDAOImpl
  implements net.javacoding.jspider.core.storage.DecisionDAO
{

    protected net.javacoding.jspider.core.logging.Log
      log;
    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected net.javacoding.jspider.core.storage.spi.DecisionDAOSPI
      spi;
    
    public DecisionDAOImpl(net.javacoding.jspider.core.logging.Log log,
                           net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                           net.javacoding.jspider.core.storage.spi.DecisionDAOSPI spi) {
        super();
        this.
          log =
          log;
        this.
          storage =
          storage;
        this.
          spi =
          spi;
    }
    
    public void
      saveSpiderDecision(
      net.javacoding.jspider.api.model.Resource resource,
      net.javacoding.jspider.api.model.Decision decision) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        net.javacoding.jspider.core.model.DecisionInternal di =
          TypeTranslator.
            translate(
            decision);
        spi.
          saveSpiderDecision(
          ri,
          di);
    }
    
    public void
      saveParseDecision(
      net.javacoding.jspider.api.model.Resource resource,
      net.javacoding.jspider.api.model.Decision decision) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        net.javacoding.jspider.core.model.DecisionInternal di =
          TypeTranslator.
            translate(
            decision);
        spi.
          saveParseDecision(
          ri,
          di);
    }
    
    public net.javacoding.jspider.api.model.Decision
      findSpiderDecision(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 findSpiderDecision(
                 ri);
    }
    
    public net.javacoding.jspider.api.model.Decision
      findParseDecision(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 findParseDecision(
                 ri);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ze2wcRxkfn+3zI24cP5qG2Ikd15BY9d35fD77HP9BXdsh" +
       "l1xi1+c0xHV1Xe/O\nOZvs7W53586XUKIi2qZUqKhKWgqERiBQECqvRk3/AD" +
       "WEtDxaIsCgtlBaUVKqoJKoBaFGUBS+md27\nndu7JC6HpV2PZ79vvvdvvhk/" +
       "dRFVmwZqF00/OaBj0z8WnxIME0tjimCaMzCVEF+orps6sV3VPKgi\nhjyyRF" +
       "BjTDQDkkCEgCwFouMjWQN16ppyYEHRiL1O0Sqbb/5g8ZeHt7VVosZZ1CircS" +
       "IQWRzTVIKz\nZBY1pHBqHhvmqCRhaRY1qRhLcWzIgiIfBEJNnUXNprygCiRt" +
       "YHMam5qSoYTNZlrHBpOZm4yhBlFT\nTWKkRaIZJkGrYvuEjBBIE1kJxGSTjM" +
       "SQNyljRTLvQYdQZQxVJxVhAQhXx3JWBNiKgS10HsjrZVDT\nSAoizrFU7ZdV" +
       "8ESHmyNvcfd2IADWmhQme7W8qCpVgAnUbKmkCOpCIE4MWV0A0motDVIIWnvV" +
       "RYGo\nVhfE/cICThC0xk03ZX0CqjrmFspC0I1uMrYSxGytK2ZctCa9Df95eO" +
       "r9ThbzKgmLCtW/BpjWu5im\ncRIbWBWxxXg57T8a3ZNu9yAExDe6iC2a0Y8+" +
       "uyt24XSHRdNWgmZyfh8WSUL8YLB93dLoW3WVVI1a\nXTNlmgoFlrOoTtlfRr" +
       "I6ZPPq/Ir0oz/38cfTP91z37fxOx5UG0VeUVPSKTWK6rAqjdnjGhjHZBVb\n" +
       "s5PJpIlJFFUpbMqrsb/BHUlZwdQdXhjrAtnLxlkdWT8V8ATt8Sr6IqhpHIuy" +
       "CSqMj05GU7ri1wna\nrGIyR5NA1CQI/9w+U5clbMyJmoHnTEhcCOScDMRzRc" +
       "xZKrBxsaKCVq677hRI0q2aAkslxBPnX7x3\nYvvnHrKiSDPPVpWgCIj3O+L9" +
       "tng/Fe+3xfupeL9LPKqoYIJvKnQyjZpEi+tvT4+sesRnnvKgyllU\nJ6dSaS" +
       "LMKxiKUlAUbRFLCcKysomrAJZ4kLUN85DAoE1CgYVYwYBXMwbqcieqU95RGA" +
       "mQfUuHrvz6\nUmLxJM0pmgOtdHVLNYjofku3hp74XdvufqirkhItVtFgAWn3" +
       "9VdPiJce3nHy5Zde3+QUBEHdRXVa\nzEnrzK3+lKGJWAIcc5b/4r+2vnukev" +
       "gZD6qC4gX4IgIkHWDBereMgnobyWEXdRZwrkhqRkpQ6Kcc\n4NSTvYa26Myw" +
       "5LmBjWl2roCnGp61dsaupi/6sZm+WqxUo/502cCQ8fJnvX2v/GjFC8wpORBt" +
       "5NA2\njolVkk1OOGYMjGH+9Semjjx28fCdLBZ2MAjy6ul5RRazTL+bKiD2LS" +
       "Xgwb+m9ejjPcdeyQW7xVl9\n1DCEAzTW2c8srfvSz4SvAnRACZvyQcwqtJJJ" +
       "qgSmNTi35MTYDgtwLHi699j5B3v+9PtzNoRxW6ND\n9dfE/elTD5xe8lAX18" +
       "EmJZg7c+XFNkk6qmAbB4SRpTydqWP+rLcqOEhsznAw1AcKNYMkuqn6Zckf\n" +
       "00RBiY5/7cyKpUfTg9ssVW7gCKLjiWzHuW/2XOlkKtgSvRxK2n/XZARjp1P5" +
       "9Fc/QWP/O/ps7u/v\n7R/2hQYJqlQ0K/VaCdp4LUABugU6GbPpA5YHNnMeCL" +
       "IPIfoaKVu/UMQXBv1qbMqcjv3LAT2Y88et\ncXwqyqs7yqnb76h7W9nqhiO+" +
       "IepO4MqpOrhcVbkFQd1c4dB3Lxv7aEGzpEfMiC6bhOKqe/PYQpui\nHCil5j" +
       "/1z7NP1ndaRUZ52vO108bXTgFXQrzn4LHQUny3bOWsu11wER98bteTl8+RNx" +
       "iCOLhHpW3I\nFit4h8BBcuTlTJP3+8dTHlQzi1axlk9QyR2Ckqb4Mgu1Z47Z" +
       "kzGoHf57YQNmlfVIHtfb3ZjLiXUj\nrrOrwriwzB2QXWkDa7MNss0ukK1ArC" +
       "7jjKGbvTfmIbFONzQC+mEpy1WcnZJ7nJTsH3JhiOXq8VuH\nz7x18Xvy+wwn" +
       "6lnfO0o5bKXr2AwHXpWabtIOi2vx7ZW6J3VzhIkdIKieiQ0G+yJDBN1WTv6H" +
       "eiO+\nIKR/7czWaJxCBZUwa9l6CLq5YpOoIsjxJSTKSrYD0Gj6J9R0iv8IzU" +
       "7N7unozMzETrpwxNrR6Htn\nQYA2wNNi87WUDlCSvna5cMWOhMxFIsI+3Mk7" +
       "abhMJw2Ak/r7CGpgTrKpqZR9jjr0T7YNfPxaNrba\nNraWtlG3bcyDkW2fyd" +
       "k37LYv2DdUHggODPUGw75gJJcFwEpFEEuPQ3Q8T1DV9MToOB1vYQZmi+sF\n" +
       "5dDNAcB2u9HjbLmPs2VQz0FuYDmQy6mehXpbd7UjFDv+Hf7kew0PCs/fZUFh" +
       "c2HHTPM0fPxV3HNr\ng1iiQa8jmu5TcAYrDl67pe1gR8scNDXu7nhzy+CJT7" +
       "sBu4oeE3jALmRLiGe+e/q18Kt/uB+0mEU1\nOyfjY6OxCVC445riEmJTpu32" +
       "yr3yzxmy2NhZdCAuZBopRMx6A8N5Xp0pwM3OguZ0Kzztdsq2l2pO\n6etjJb" +
       "c9DzPfw0f+CLeFh5wt/GiZW3ikNxT2haGvqjWwqaUNMd9y9FwlqQTYulOahB" +
       "X/NM9hq/ll\nTs0BR82vlK1meMA3BH1nrWR/XL6aueWu32F8AXZXU8jgOFsi" +
       "x+fuGqYMOQV9asa+N3hm9h990tu3\njFulsoa/j+IJt/Zfwd0tF961+oXCvr" +
       "tEt+ES8uj6b7x98vx0q1Vu1g3OzUWXKDyPdYvDzGrQacFv\nuJYERv38LRue" +
       "OjT9xrzHdscDgFsZjV6beZm+fYh57fMFWf4JeLrsLO8qO8t/wKXPkJM+T5eX" +
       "PqGB\n3tCALxzkspyu+gQv+RQnOeJIfrZsyeGQb6iPS1y66vHr5+J3CGqiuc" +
       "iuI8c53m+VisIwPJvsKGz6\ncFGoKN5lfuL4YoA7Lpwtc6fs6w0Ns9NNYRSu" +
       "74vnoC6TkKCuuuQ0fpHTmDuPvVS2xsGgLwwdQlux\n+I1mp7UHsICWCkoEHp" +
       "8dFF/ZQfktZ2LYMfF3ZZoYZkfO8IcPyq8gQalXChKUV/g1TmFuK/hj2QrT\n" +
       "mEAWrS2S7goJnDoaXQvQO5c1RRf+1rW02LV096azetMv2FVW/uq4NoZqk2lF" +
       "4Y9L3NirGzgpM4Nr\nrcOTZf2fCdq03JtKwFn6i/noTYv9L4Dvy2B3dfQ28w" +
       "VI2Gswgzj6i+d4h6DVpTlAgj3i6S8RtLKQ\nHlpq5w+e9D3ohIGUDv+e71hX" +
       "Oace6wxLd6hW7rwU1yFw9CIp+/UfVt3+yG/+zVq1GtH6rwv9TwOc\n8jIQWh" +
       "IYVQXlgMmOzPQbvY0V04aBVcJ6WjtOK0xrRes/C238ITEvq3tmz9RE0Tkx2D" +
       "f4fzkiQI1V\n0SNCOXfYcKr8SCkvMc35syO1QbQF/hcgNqxDKxsAAA==");
}
