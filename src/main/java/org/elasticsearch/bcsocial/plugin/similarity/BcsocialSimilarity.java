package org.elasticsearch.bcsocial.plugin.similarity;

import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.search.similarities.TFIDFSimilarity;
import org.apache.lucene.search.similarities.DefaultSimilarity;

public class BcsocialSimilarity extends DefaultSimilarity {
	
  public BcsocialSimilarity() {}

  @Override
  public float lengthNorm(FieldInvertState state) {
   return 1.0f;
  }

  @Override
  public float coord(int overlap, int maxOverlap) {
    return 1.0f;
  }

  @Override
  public float queryNorm(float sumOfSquaredWeights) {
    return 1.0f;
  }

  @Override
  public float tf(float freq) {
    return 1.0f;
  }

  @Override
  public float idf(long docFreq, long numDocs) {
    return 1.0f;
  }

  @Override
  public String toString() {
    return "BcsocialSimilarity";
  }
}
