package org.emoflon.ibex.gt.hipe.runtime;

import org.emoflon.ibex.common.operational.SimpleMatch;
import hipe.engine.match.ProductionMatch;


/**
 * A graph transformation match from Democles.
 */
public class HiPEGTMatch extends SimpleMatch {
	/**
	 * Creates a new HiPEGTMatch with the given match and pattern.
	 * 
	 * @param match
	 *            the HiPE match
	 * @param pattern
	 *            the HiPE pattern
	 */
	public HiPEGTMatch(final ProductionMatch match, String patternName) {
		super(patternName);
		for(String label : match.getLabels()) {
			put(label, match.getNode(label));
		}
	}
}
