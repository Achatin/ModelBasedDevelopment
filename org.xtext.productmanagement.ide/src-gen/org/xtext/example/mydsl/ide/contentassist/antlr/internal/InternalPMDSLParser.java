package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.PMDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPMDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'number'", "'string'", "'boolean'", "'date'", "'number[]'", "'string[]'", "'boolean[]'", "'date[]'", "'1'", "'*'", "'1-*'", "'1-1'", "'entity'", "'{'", "'}'", "'attribute'", "'as'", "'relations'", "'-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPMDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPMDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPMDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPMDSL.g"; }


    	private PMDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PMDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalPMDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPMDSL.g:54:1: ( ruleModel EOF )
            // InternalPMDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPMDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPMDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPMDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalPMDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalPMDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalPMDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalPMDSL.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalPMDSL.g:79:1: ( ruleEntity EOF )
            // InternalPMDSL.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalPMDSL.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalPMDSL.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalPMDSL.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalPMDSL.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalPMDSL.g:94:3: ( rule__Entity__Group__0 )
            // InternalPMDSL.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalPMDSL.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalPMDSL.g:104:1: ( ruleAttribute EOF )
            // InternalPMDSL.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPMDSL.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalPMDSL.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalPMDSL.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalPMDSL.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalPMDSL.g:119:3: ( rule__Attribute__Group__0 )
            // InternalPMDSL.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalPMDSL.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalPMDSL.g:129:1: ( ruleType EOF )
            // InternalPMDSL.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPMDSL.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPMDSL.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPMDSL.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalPMDSL.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPMDSL.g:144:3: ( rule__Type__Alternatives )
            // InternalPMDSL.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalPMDSL.g:153:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalPMDSL.g:154:1: ( rulePrimitiveType EOF )
            // InternalPMDSL.g:155:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalPMDSL.g:162:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:166:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalPMDSL.g:167:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalPMDSL.g:167:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalPMDSL.g:168:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalPMDSL.g:169:3: ( rule__PrimitiveType__Alternatives )
            // InternalPMDSL.g:169:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleRelation"
    // InternalPMDSL.g:178:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalPMDSL.g:179:1: ( ruleRelation EOF )
            // InternalPMDSL.g:180:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalPMDSL.g:187:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:191:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalPMDSL.g:192:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalPMDSL.g:192:2: ( ( rule__Relation__Group__0 ) )
            // InternalPMDSL.g:193:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalPMDSL.g:194:3: ( rule__Relation__Group__0 )
            // InternalPMDSL.g:194:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationElement"
    // InternalPMDSL.g:203:1: entryRuleRelationElement : ruleRelationElement EOF ;
    public final void entryRuleRelationElement() throws RecognitionException {
        try {
            // InternalPMDSL.g:204:1: ( ruleRelationElement EOF )
            // InternalPMDSL.g:205:1: ruleRelationElement EOF
            {
             before(grammarAccess.getRelationElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationElement();

            state._fsp--;

             after(grammarAccess.getRelationElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationElement"


    // $ANTLR start "ruleRelationElement"
    // InternalPMDSL.g:212:1: ruleRelationElement : ( ( rule__RelationElement__Group__0 ) ) ;
    public final void ruleRelationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:216:2: ( ( ( rule__RelationElement__Group__0 ) ) )
            // InternalPMDSL.g:217:2: ( ( rule__RelationElement__Group__0 ) )
            {
            // InternalPMDSL.g:217:2: ( ( rule__RelationElement__Group__0 ) )
            // InternalPMDSL.g:218:3: ( rule__RelationElement__Group__0 )
            {
             before(grammarAccess.getRelationElementAccess().getGroup()); 
            // InternalPMDSL.g:219:3: ( rule__RelationElement__Group__0 )
            // InternalPMDSL.g:219:4: rule__RelationElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationElement"


    // $ANTLR start "entryRuleCardinality"
    // InternalPMDSL.g:228:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalPMDSL.g:229:1: ( ruleCardinality EOF )
            // InternalPMDSL.g:230:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalPMDSL.g:237:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:241:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalPMDSL.g:242:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalPMDSL.g:242:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalPMDSL.g:243:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalPMDSL.g:244:3: ( rule__Cardinality__Alternatives )
            // InternalPMDSL.g:244:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPMDSL.g:252:1: rule__Type__Alternatives : ( ( ( rule__Type__EntityAssignment_0 ) ) | ( ( rule__Type__PrimitiveAssignment_1 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:256:1: ( ( ( rule__Type__EntityAssignment_0 ) ) | ( ( rule__Type__PrimitiveAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=18)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPMDSL.g:257:2: ( ( rule__Type__EntityAssignment_0 ) )
                    {
                    // InternalPMDSL.g:257:2: ( ( rule__Type__EntityAssignment_0 ) )
                    // InternalPMDSL.g:258:3: ( rule__Type__EntityAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getEntityAssignment_0()); 
                    // InternalPMDSL.g:259:3: ( rule__Type__EntityAssignment_0 )
                    // InternalPMDSL.g:259:4: rule__Type__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__EntityAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getEntityAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPMDSL.g:263:2: ( ( rule__Type__PrimitiveAssignment_1 ) )
                    {
                    // InternalPMDSL.g:263:2: ( ( rule__Type__PrimitiveAssignment_1 ) )
                    // InternalPMDSL.g:264:3: ( rule__Type__PrimitiveAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveAssignment_1()); 
                    // InternalPMDSL.g:265:3: ( rule__Type__PrimitiveAssignment_1 )
                    // InternalPMDSL.g:265:4: rule__Type__PrimitiveAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__PrimitiveAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getPrimitiveAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalPMDSL.g:273:1: rule__PrimitiveType__Alternatives : ( ( 'number' ) | ( 'string' ) | ( 'boolean' ) | ( 'date' ) | ( 'number[]' ) | ( 'string[]' ) | ( 'boolean[]' ) | ( 'date[]' ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:277:1: ( ( 'number' ) | ( 'string' ) | ( 'boolean' ) | ( 'date' ) | ( 'number[]' ) | ( 'string[]' ) | ( 'boolean[]' ) | ( 'date[]' ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPMDSL.g:278:2: ( 'number' )
                    {
                    // InternalPMDSL.g:278:2: ( 'number' )
                    // InternalPMDSL.g:279:3: 'number'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNumberKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getNumberKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPMDSL.g:284:2: ( 'string' )
                    {
                    // InternalPMDSL.g:284:2: ( 'string' )
                    // InternalPMDSL.g:285:3: 'string'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPMDSL.g:290:2: ( 'boolean' )
                    {
                    // InternalPMDSL.g:290:2: ( 'boolean' )
                    // InternalPMDSL.g:291:3: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPMDSL.g:296:2: ( 'date' )
                    {
                    // InternalPMDSL.g:296:2: ( 'date' )
                    // InternalPMDSL.g:297:3: 'date'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDateKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getDateKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPMDSL.g:302:2: ( 'number[]' )
                    {
                    // InternalPMDSL.g:302:2: ( 'number[]' )
                    // InternalPMDSL.g:303:3: 'number[]'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNumberKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getNumberKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPMDSL.g:308:2: ( 'string[]' )
                    {
                    // InternalPMDSL.g:308:2: ( 'string[]' )
                    // InternalPMDSL.g:309:3: 'string[]'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPMDSL.g:314:2: ( 'boolean[]' )
                    {
                    // InternalPMDSL.g:314:2: ( 'boolean[]' )
                    // InternalPMDSL.g:315:3: 'boolean[]'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPMDSL.g:320:2: ( 'date[]' )
                    {
                    // InternalPMDSL.g:320:2: ( 'date[]' )
                    // InternalPMDSL.g:321:3: 'date[]'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDateKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getDateKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalPMDSL.g:330:1: rule__Cardinality__Alternatives : ( ( '1' ) | ( '*' ) | ( '1-*' ) | ( '1-1' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:334:1: ( ( '1' ) | ( '*' ) | ( '1-*' ) | ( '1-1' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPMDSL.g:335:2: ( '1' )
                    {
                    // InternalPMDSL.g:335:2: ( '1' )
                    // InternalPMDSL.g:336:3: '1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPMDSL.g:341:2: ( '*' )
                    {
                    // InternalPMDSL.g:341:2: ( '*' )
                    // InternalPMDSL.g:342:3: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPMDSL.g:347:2: ( '1-*' )
                    {
                    // InternalPMDSL.g:347:2: ( '1-*' )
                    // InternalPMDSL.g:348:3: '1-*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneHyphenMinusAsteriskKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneHyphenMinusAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPMDSL.g:353:2: ( '1-1' )
                    {
                    // InternalPMDSL.g:353:2: ( '1-1' )
                    // InternalPMDSL.g:354:3: '1-1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneHyphenMinusDigitOneKeyword_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneHyphenMinusDigitOneKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalPMDSL.g:363:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:367:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPMDSL.g:368:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalPMDSL.g:375:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:379:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // InternalPMDSL.g:380:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // InternalPMDSL.g:380:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // InternalPMDSL.g:381:2: ( rule__Model__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            // InternalPMDSL.g:382:2: ( rule__Model__EntitiesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPMDSL.g:382:3: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalPMDSL.g:390:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:394:1: ( rule__Model__Group__1__Impl )
            // InternalPMDSL.g:395:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalPMDSL.g:401:1: rule__Model__Group__1__Impl : ( ( rule__Model__RelationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:405:1: ( ( ( rule__Model__RelationsAssignment_1 )* ) )
            // InternalPMDSL.g:406:1: ( ( rule__Model__RelationsAssignment_1 )* )
            {
            // InternalPMDSL.g:406:1: ( ( rule__Model__RelationsAssignment_1 )* )
            // InternalPMDSL.g:407:2: ( rule__Model__RelationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRelationsAssignment_1()); 
            // InternalPMDSL.g:408:2: ( rule__Model__RelationsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPMDSL.g:408:3: rule__Model__RelationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RelationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRelationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalPMDSL.g:417:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:421:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalPMDSL.g:422:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalPMDSL.g:429:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:433:1: ( ( 'entity' ) )
            // InternalPMDSL.g:434:1: ( 'entity' )
            {
            // InternalPMDSL.g:434:1: ( 'entity' )
            // InternalPMDSL.g:435:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalPMDSL.g:444:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:448:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalPMDSL.g:449:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalPMDSL.g:456:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:460:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalPMDSL.g:461:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalPMDSL.g:461:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalPMDSL.g:462:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalPMDSL.g:463:2: ( rule__Entity__NameAssignment_1 )
            // InternalPMDSL.g:463:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalPMDSL.g:471:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:475:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalPMDSL.g:476:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalPMDSL.g:483:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:487:1: ( ( '{' ) )
            // InternalPMDSL.g:488:1: ( '{' )
            {
            // InternalPMDSL.g:488:1: ( '{' )
            // InternalPMDSL.g:489:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalPMDSL.g:498:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:502:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalPMDSL.g:503:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalPMDSL.g:510:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:514:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalPMDSL.g:515:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalPMDSL.g:515:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalPMDSL.g:516:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalPMDSL.g:517:2: ( rule__Entity__AttributesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPMDSL.g:517:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalPMDSL.g:525:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:529:1: ( rule__Entity__Group__4__Impl )
            // InternalPMDSL.g:530:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalPMDSL.g:536:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:540:1: ( ( '}' ) )
            // InternalPMDSL.g:541:1: ( '}' )
            {
            // InternalPMDSL.g:541:1: ( '}' )
            // InternalPMDSL.g:542:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalPMDSL.g:552:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:556:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalPMDSL.g:557:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalPMDSL.g:564:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:568:1: ( ( 'attribute' ) )
            // InternalPMDSL.g:569:1: ( 'attribute' )
            {
            // InternalPMDSL.g:569:1: ( 'attribute' )
            // InternalPMDSL.g:570:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalPMDSL.g:579:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:583:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalPMDSL.g:584:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalPMDSL.g:591:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:595:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalPMDSL.g:596:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalPMDSL.g:596:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalPMDSL.g:597:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalPMDSL.g:598:2: ( rule__Attribute__NameAssignment_1 )
            // InternalPMDSL.g:598:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalPMDSL.g:606:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:610:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalPMDSL.g:611:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalPMDSL.g:618:1: rule__Attribute__Group__2__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:622:1: ( ( 'as' ) )
            // InternalPMDSL.g:623:1: ( 'as' )
            {
            // InternalPMDSL.g:623:1: ( 'as' )
            // InternalPMDSL.g:624:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalPMDSL.g:633:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:637:1: ( rule__Attribute__Group__3__Impl )
            // InternalPMDSL.g:638:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalPMDSL.g:644:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:648:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalPMDSL.g:649:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalPMDSL.g:649:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalPMDSL.g:650:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalPMDSL.g:651:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalPMDSL.g:651:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalPMDSL.g:660:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:664:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalPMDSL.g:665:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalPMDSL.g:672:1: rule__Relation__Group__0__Impl : ( 'relations' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:676:1: ( ( 'relations' ) )
            // InternalPMDSL.g:677:1: ( 'relations' )
            {
            // InternalPMDSL.g:677:1: ( 'relations' )
            // InternalPMDSL.g:678:2: 'relations'
            {
             before(grammarAccess.getRelationAccess().getRelationsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalPMDSL.g:687:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:691:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalPMDSL.g:692:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalPMDSL.g:699:1: rule__Relation__Group__1__Impl : ( '{' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:703:1: ( ( '{' ) )
            // InternalPMDSL.g:704:1: ( '{' )
            {
            // InternalPMDSL.g:704:1: ( '{' )
            // InternalPMDSL.g:705:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalPMDSL.g:714:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:718:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalPMDSL.g:719:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalPMDSL.g:726:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__RelationsListAssignment_2 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:730:1: ( ( ( rule__Relation__RelationsListAssignment_2 )* ) )
            // InternalPMDSL.g:731:1: ( ( rule__Relation__RelationsListAssignment_2 )* )
            {
            // InternalPMDSL.g:731:1: ( ( rule__Relation__RelationsListAssignment_2 )* )
            // InternalPMDSL.g:732:2: ( rule__Relation__RelationsListAssignment_2 )*
            {
             before(grammarAccess.getRelationAccess().getRelationsListAssignment_2()); 
            // InternalPMDSL.g:733:2: ( rule__Relation__RelationsListAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPMDSL.g:733:3: rule__Relation__RelationsListAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Relation__RelationsListAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRelationAccess().getRelationsListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalPMDSL.g:741:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:745:1: ( rule__Relation__Group__3__Impl )
            // InternalPMDSL.g:746:2: rule__Relation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalPMDSL.g:752:1: rule__Relation__Group__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:756:1: ( ( '}' ) )
            // InternalPMDSL.g:757:1: ( '}' )
            {
            // InternalPMDSL.g:757:1: ( '}' )
            // InternalPMDSL.g:758:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__RelationElement__Group__0"
    // InternalPMDSL.g:768:1: rule__RelationElement__Group__0 : rule__RelationElement__Group__0__Impl rule__RelationElement__Group__1 ;
    public final void rule__RelationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:772:1: ( rule__RelationElement__Group__0__Impl rule__RelationElement__Group__1 )
            // InternalPMDSL.g:773:2: rule__RelationElement__Group__0__Impl rule__RelationElement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RelationElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__0"


    // $ANTLR start "rule__RelationElement__Group__0__Impl"
    // InternalPMDSL.g:780:1: rule__RelationElement__Group__0__Impl : ( ( rule__RelationElement__Entity1Assignment_0 ) ) ;
    public final void rule__RelationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:784:1: ( ( ( rule__RelationElement__Entity1Assignment_0 ) ) )
            // InternalPMDSL.g:785:1: ( ( rule__RelationElement__Entity1Assignment_0 ) )
            {
            // InternalPMDSL.g:785:1: ( ( rule__RelationElement__Entity1Assignment_0 ) )
            // InternalPMDSL.g:786:2: ( rule__RelationElement__Entity1Assignment_0 )
            {
             before(grammarAccess.getRelationElementAccess().getEntity1Assignment_0()); 
            // InternalPMDSL.g:787:2: ( rule__RelationElement__Entity1Assignment_0 )
            // InternalPMDSL.g:787:3: rule__RelationElement__Entity1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationElement__Entity1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationElementAccess().getEntity1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__0__Impl"


    // $ANTLR start "rule__RelationElement__Group__1"
    // InternalPMDSL.g:795:1: rule__RelationElement__Group__1 : rule__RelationElement__Group__1__Impl rule__RelationElement__Group__2 ;
    public final void rule__RelationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:799:1: ( rule__RelationElement__Group__1__Impl rule__RelationElement__Group__2 )
            // InternalPMDSL.g:800:2: rule__RelationElement__Group__1__Impl rule__RelationElement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__RelationElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__1"


    // $ANTLR start "rule__RelationElement__Group__1__Impl"
    // InternalPMDSL.g:807:1: rule__RelationElement__Group__1__Impl : ( ( rule__RelationElement__Cardinality1Assignment_1 ) ) ;
    public final void rule__RelationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:811:1: ( ( ( rule__RelationElement__Cardinality1Assignment_1 ) ) )
            // InternalPMDSL.g:812:1: ( ( rule__RelationElement__Cardinality1Assignment_1 ) )
            {
            // InternalPMDSL.g:812:1: ( ( rule__RelationElement__Cardinality1Assignment_1 ) )
            // InternalPMDSL.g:813:2: ( rule__RelationElement__Cardinality1Assignment_1 )
            {
             before(grammarAccess.getRelationElementAccess().getCardinality1Assignment_1()); 
            // InternalPMDSL.g:814:2: ( rule__RelationElement__Cardinality1Assignment_1 )
            // InternalPMDSL.g:814:3: rule__RelationElement__Cardinality1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationElement__Cardinality1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationElementAccess().getCardinality1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__1__Impl"


    // $ANTLR start "rule__RelationElement__Group__2"
    // InternalPMDSL.g:822:1: rule__RelationElement__Group__2 : rule__RelationElement__Group__2__Impl rule__RelationElement__Group__3 ;
    public final void rule__RelationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:826:1: ( rule__RelationElement__Group__2__Impl rule__RelationElement__Group__3 )
            // InternalPMDSL.g:827:2: rule__RelationElement__Group__2__Impl rule__RelationElement__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RelationElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__2"


    // $ANTLR start "rule__RelationElement__Group__2__Impl"
    // InternalPMDSL.g:834:1: rule__RelationElement__Group__2__Impl : ( '-' ) ;
    public final void rule__RelationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:838:1: ( ( '-' ) )
            // InternalPMDSL.g:839:1: ( '-' )
            {
            // InternalPMDSL.g:839:1: ( '-' )
            // InternalPMDSL.g:840:2: '-'
            {
             before(grammarAccess.getRelationElementAccess().getHyphenMinusKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRelationElementAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__2__Impl"


    // $ANTLR start "rule__RelationElement__Group__3"
    // InternalPMDSL.g:849:1: rule__RelationElement__Group__3 : rule__RelationElement__Group__3__Impl rule__RelationElement__Group__4 ;
    public final void rule__RelationElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:853:1: ( rule__RelationElement__Group__3__Impl rule__RelationElement__Group__4 )
            // InternalPMDSL.g:854:2: rule__RelationElement__Group__3__Impl rule__RelationElement__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RelationElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__3"


    // $ANTLR start "rule__RelationElement__Group__3__Impl"
    // InternalPMDSL.g:861:1: rule__RelationElement__Group__3__Impl : ( ( rule__RelationElement__Cardinality2Assignment_3 ) ) ;
    public final void rule__RelationElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:865:1: ( ( ( rule__RelationElement__Cardinality2Assignment_3 ) ) )
            // InternalPMDSL.g:866:1: ( ( rule__RelationElement__Cardinality2Assignment_3 ) )
            {
            // InternalPMDSL.g:866:1: ( ( rule__RelationElement__Cardinality2Assignment_3 ) )
            // InternalPMDSL.g:867:2: ( rule__RelationElement__Cardinality2Assignment_3 )
            {
             before(grammarAccess.getRelationElementAccess().getCardinality2Assignment_3()); 
            // InternalPMDSL.g:868:2: ( rule__RelationElement__Cardinality2Assignment_3 )
            // InternalPMDSL.g:868:3: rule__RelationElement__Cardinality2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RelationElement__Cardinality2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationElementAccess().getCardinality2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__3__Impl"


    // $ANTLR start "rule__RelationElement__Group__4"
    // InternalPMDSL.g:876:1: rule__RelationElement__Group__4 : rule__RelationElement__Group__4__Impl ;
    public final void rule__RelationElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:880:1: ( rule__RelationElement__Group__4__Impl )
            // InternalPMDSL.g:881:2: rule__RelationElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__4"


    // $ANTLR start "rule__RelationElement__Group__4__Impl"
    // InternalPMDSL.g:887:1: rule__RelationElement__Group__4__Impl : ( ( rule__RelationElement__Entity2Assignment_4 ) ) ;
    public final void rule__RelationElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:891:1: ( ( ( rule__RelationElement__Entity2Assignment_4 ) ) )
            // InternalPMDSL.g:892:1: ( ( rule__RelationElement__Entity2Assignment_4 ) )
            {
            // InternalPMDSL.g:892:1: ( ( rule__RelationElement__Entity2Assignment_4 ) )
            // InternalPMDSL.g:893:2: ( rule__RelationElement__Entity2Assignment_4 )
            {
             before(grammarAccess.getRelationElementAccess().getEntity2Assignment_4()); 
            // InternalPMDSL.g:894:2: ( rule__RelationElement__Entity2Assignment_4 )
            // InternalPMDSL.g:894:3: rule__RelationElement__Entity2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RelationElement__Entity2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationElementAccess().getEntity2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Group__4__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment_0"
    // InternalPMDSL.g:903:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:907:1: ( ( ruleEntity ) )
            // InternalPMDSL.g:908:2: ( ruleEntity )
            {
            // InternalPMDSL.g:908:2: ( ruleEntity )
            // InternalPMDSL.g:909:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment_0"


    // $ANTLR start "rule__Model__RelationsAssignment_1"
    // InternalPMDSL.g:918:1: rule__Model__RelationsAssignment_1 : ( ruleRelation ) ;
    public final void rule__Model__RelationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:922:1: ( ( ruleRelation ) )
            // InternalPMDSL.g:923:2: ( ruleRelation )
            {
            // InternalPMDSL.g:923:2: ( ruleRelation )
            // InternalPMDSL.g:924:3: ruleRelation
            {
             before(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RelationsAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalPMDSL.g:933:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:937:1: ( ( RULE_ID ) )
            // InternalPMDSL.g:938:2: ( RULE_ID )
            {
            // InternalPMDSL.g:938:2: ( RULE_ID )
            // InternalPMDSL.g:939:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalPMDSL.g:948:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:952:1: ( ( ruleAttribute ) )
            // InternalPMDSL.g:953:2: ( ruleAttribute )
            {
            // InternalPMDSL.g:953:2: ( ruleAttribute )
            // InternalPMDSL.g:954:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalPMDSL.g:963:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:967:1: ( ( RULE_ID ) )
            // InternalPMDSL.g:968:2: ( RULE_ID )
            {
            // InternalPMDSL.g:968:2: ( RULE_ID )
            // InternalPMDSL.g:969:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalPMDSL.g:978:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:982:1: ( ( ruleType ) )
            // InternalPMDSL.g:983:2: ( ruleType )
            {
            // InternalPMDSL.g:983:2: ( ruleType )
            // InternalPMDSL.g:984:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Type__EntityAssignment_0"
    // InternalPMDSL.g:993:1: rule__Type__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Type__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:997:1: ( ( ( RULE_ID ) ) )
            // InternalPMDSL.g:998:2: ( ( RULE_ID ) )
            {
            // InternalPMDSL.g:998:2: ( ( RULE_ID ) )
            // InternalPMDSL.g:999:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getEntityEntityCrossReference_0_0()); 
            // InternalPMDSL.g:1000:3: ( RULE_ID )
            // InternalPMDSL.g:1001:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getEntityEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__EntityAssignment_0"


    // $ANTLR start "rule__Type__PrimitiveAssignment_1"
    // InternalPMDSL.g:1012:1: rule__Type__PrimitiveAssignment_1 : ( rulePrimitiveType ) ;
    public final void rule__Type__PrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:1016:1: ( ( rulePrimitiveType ) )
            // InternalPMDSL.g:1017:2: ( rulePrimitiveType )
            {
            // InternalPMDSL.g:1017:2: ( rulePrimitiveType )
            // InternalPMDSL.g:1018:3: rulePrimitiveType
            {
             before(grammarAccess.getTypeAccess().getPrimitivePrimitiveTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPrimitivePrimitiveTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PrimitiveAssignment_1"


    // $ANTLR start "rule__Relation__RelationsListAssignment_2"
    // InternalPMDSL.g:1027:1: rule__Relation__RelationsListAssignment_2 : ( ruleRelationElement ) ;
    public final void rule__Relation__RelationsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:1031:1: ( ( ruleRelationElement ) )
            // InternalPMDSL.g:1032:2: ( ruleRelationElement )
            {
            // InternalPMDSL.g:1032:2: ( ruleRelationElement )
            // InternalPMDSL.g:1033:3: ruleRelationElement
            {
             before(grammarAccess.getRelationAccess().getRelationsListRelationElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationElement();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRelationsListRelationElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__RelationsListAssignment_2"


    // $ANTLR start "rule__RelationElement__Entity1Assignment_0"
    // InternalPMDSL.g:1042:1: rule__RelationElement__Entity1Assignment_0 : ( RULE_ID ) ;
    public final void rule__RelationElement__Entity1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:1046:1: ( ( RULE_ID ) )
            // InternalPMDSL.g:1047:2: ( RULE_ID )
            {
            // InternalPMDSL.g:1047:2: ( RULE_ID )
            // InternalPMDSL.g:1048:3: RULE_ID
            {
             before(grammarAccess.getRelationElementAccess().getEntity1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationElementAccess().getEntity1IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Entity1Assignment_0"


    // $ANTLR start "rule__RelationElement__Cardinality1Assignment_1"
    // InternalPMDSL.g:1057:1: rule__RelationElement__Cardinality1Assignment_1 : ( ruleCardinality ) ;
    public final void rule__RelationElement__Cardinality1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:1061:1: ( ( ruleCardinality ) )
            // InternalPMDSL.g:1062:2: ( ruleCardinality )
            {
            // InternalPMDSL.g:1062:2: ( ruleCardinality )
            // InternalPMDSL.g:1063:3: ruleCardinality
            {
             before(grammarAccess.getRelationElementAccess().getCardinality1CardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationElementAccess().getCardinality1CardinalityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Cardinality1Assignment_1"


    // $ANTLR start "rule__RelationElement__Cardinality2Assignment_3"
    // InternalPMDSL.g:1072:1: rule__RelationElement__Cardinality2Assignment_3 : ( ruleCardinality ) ;
    public final void rule__RelationElement__Cardinality2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:1076:1: ( ( ruleCardinality ) )
            // InternalPMDSL.g:1077:2: ( ruleCardinality )
            {
            // InternalPMDSL.g:1077:2: ( ruleCardinality )
            // InternalPMDSL.g:1078:3: ruleCardinality
            {
             before(grammarAccess.getRelationElementAccess().getCardinality2CardinalityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationElementAccess().getCardinality2CardinalityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Cardinality2Assignment_3"


    // $ANTLR start "rule__RelationElement__Entity2Assignment_4"
    // InternalPMDSL.g:1087:1: rule__RelationElement__Entity2Assignment_4 : ( RULE_ID ) ;
    public final void rule__RelationElement__Entity2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPMDSL.g:1091:1: ( ( RULE_ID ) )
            // InternalPMDSL.g:1092:2: ( RULE_ID )
            {
            // InternalPMDSL.g:1092:2: ( RULE_ID )
            // InternalPMDSL.g:1093:3: RULE_ID
            {
             before(grammarAccess.getRelationElementAccess().getEntity2IDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationElementAccess().getEntity2IDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationElement__Entity2Assignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});

}