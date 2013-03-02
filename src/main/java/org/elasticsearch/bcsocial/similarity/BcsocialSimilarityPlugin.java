/**
 * 
 */
package org.elasticsearch.bcsocial.similarity;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 * @author hadoop
 *
 */
public class BcsocialSimilarityPlugin extends AbstractPlugin {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "bcsocial-similarity";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "score arithmetic";
	}
	
	public void onModule(SimilarityModule module)
	{
		
	}

}
