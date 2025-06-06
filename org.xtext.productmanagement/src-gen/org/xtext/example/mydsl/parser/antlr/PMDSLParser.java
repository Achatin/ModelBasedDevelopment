/*
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalPMDSLParser;
import org.xtext.example.mydsl.services.PMDSLGrammarAccess;

public class PMDSLParser extends AbstractAntlrParser {

	@Inject
	private PMDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPMDSLParser createParser(XtextTokenStream stream) {
		return new InternalPMDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public PMDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PMDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
