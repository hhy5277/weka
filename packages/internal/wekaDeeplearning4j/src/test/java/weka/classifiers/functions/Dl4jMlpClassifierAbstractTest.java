package weka.classifiers.functions;

import org.deeplearning4j.nn.conf.layers.Layer;
import weka.classifiers.AbstractClassifierTest;
import weka.classifiers.CheckClassifier;
import weka.classifiers.Classifier;
import weka.dl4j.layers.DenseLayer;
import weka.dl4j.layers.OutputLayer;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Dl4jMlpClassifierAbstractTest extends AbstractClassifierTest {

  public Dl4jMlpClassifierAbstractTest(String name) {
    super(name);
  }

  @Override
  public Classifier getClassifier() {
    Dl4jMlpClassifier mlp = new Dl4jMlpClassifier();
    DenseLayer dl = new DenseLayer();
    dl.setNOut(2);
    mlp.setLayers(new Layer[] { dl, new OutputLayer() });
    return mlp;
  }

  public static Test suite() {
    return new TestSuite(Dl4jMlpClassifierAbstractTest.class);
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
