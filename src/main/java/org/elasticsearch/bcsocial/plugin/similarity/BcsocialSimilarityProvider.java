package org.elasticsearch.bcsocial.plugin.similarity;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

public class BcsocialSimilarityProvider extends	AbstractSimilarityProvider {

	private final BcsocialSimilarity bcsocialSimilarity = new BcsocialSimilarity();

	@Inject
	protected BcsocialSimilarityProvider(@Assisted String name,	@Assisted Settings settings) {
		super(name);
	}

	@Override
	public BcsocialSimilarity get() {
		// TODO Auto-generated method stub
		return this.bcsocialSimilarity;
	}
}
