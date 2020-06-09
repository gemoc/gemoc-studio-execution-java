package org.eclipse.gemoc.execution.sequential.javaxdsml.ruleprovider;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.gemoc.xdsmlframework.api.extensions.metaprog.IRule;
import org.eclipse.gemoc.xdsmlframework.api.extensions.metaprog.IRuleProvider;


/**
 * RuleProvider used for the Truffle meta-programming approach
 * @author LEROY Dorian
 *
 */
public class TruffleRuleProvider implements IRuleProvider {
	
	@Override
	public Collection<IRule> getValidationRules(){
		return Collections.emptyList();
	}

}
