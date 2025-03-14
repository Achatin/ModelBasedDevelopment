package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PMDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPMDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'attribute'", "'as'", "'number'", "'string'", "'boolean'", "'date'", "'number[]'", "'string[]'", "'boolean[]'", "'date[]'", "'relations'", "'-'", "'1'", "'*'", "'1-*'", "'1-1'"
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

        public InternalPMDSLParser(TokenStream input, PMDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PMDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPMDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPMDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPMDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPMDSL.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relations_1_0= ruleRelation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_relations_1_0 = null;



        	enterRule();

        try {
            // InternalPMDSL.g:77:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relations_1_0= ruleRelation ) )* ) )
            // InternalPMDSL.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relations_1_0= ruleRelation ) )* )
            {
            // InternalPMDSL.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relations_1_0= ruleRelation ) )* )
            // InternalPMDSL.g:79:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relations_1_0= ruleRelation ) )*
            {
            // InternalPMDSL.g:79:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPMDSL.g:80:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalPMDSL.g:80:4: (lv_entities_0_0= ruleEntity )
            	    // InternalPMDSL.g:81:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"org.xtext.example.mydsl.PMDSL.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPMDSL.g:98:3: ( (lv_relations_1_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPMDSL.g:99:4: (lv_relations_1_0= ruleRelation )
            	    {
            	    // InternalPMDSL.g:99:4: (lv_relations_1_0= ruleRelation )
            	    // InternalPMDSL.g:100:5: lv_relations_1_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_relations_1_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_1_0,
            	    						"org.xtext.example.mydsl.PMDSL.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalPMDSL.g:121:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalPMDSL.g:121:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalPMDSL.g:122:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalPMDSL.g:128:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalPMDSL.g:134:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalPMDSL.g:135:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalPMDSL.g:135:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalPMDSL.g:136:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalPMDSL.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPMDSL.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPMDSL.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalPMDSL.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPMDSL.g:162:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPMDSL.g:163:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalPMDSL.g:163:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalPMDSL.g:164:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.example.mydsl.PMDSL.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalPMDSL.g:189:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalPMDSL.g:189:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalPMDSL.g:190:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPMDSL.g:196:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPMDSL.g:202:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalPMDSL.g:203:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalPMDSL.g:203:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            // InternalPMDSL.g:204:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalPMDSL.g:208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPMDSL.g:209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPMDSL.g:209:4: (lv_name_1_0= RULE_ID )
            // InternalPMDSL.g:210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsKeyword_2());
            		
            // InternalPMDSL.g:230:3: ( (lv_type_3_0= ruleType ) )
            // InternalPMDSL.g:231:4: (lv_type_3_0= ruleType )
            {
            // InternalPMDSL.g:231:4: (lv_type_3_0= ruleType )
            // InternalPMDSL.g:232:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.PMDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalPMDSL.g:253:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalPMDSL.g:253:45: (iv_ruleType= ruleType EOF )
            // InternalPMDSL.g:254:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPMDSL.g:260:1: ruleType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitive_1_0= rulePrimitiveType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_primitive_1_0 = null;



        	enterRule();

        try {
            // InternalPMDSL.g:266:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitive_1_0= rulePrimitiveType ) ) ) )
            // InternalPMDSL.g:267:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitive_1_0= rulePrimitiveType ) ) )
            {
            // InternalPMDSL.g:267:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitive_1_0= rulePrimitiveType ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=16 && LA4_0<=23)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPMDSL.g:268:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalPMDSL.g:268:3: ( (otherlv_0= RULE_ID ) )
                    // InternalPMDSL.g:269:4: (otherlv_0= RULE_ID )
                    {
                    // InternalPMDSL.g:269:4: (otherlv_0= RULE_ID )
                    // InternalPMDSL.g:270:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getEntityEntityCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPMDSL.g:282:3: ( (lv_primitive_1_0= rulePrimitiveType ) )
                    {
                    // InternalPMDSL.g:282:3: ( (lv_primitive_1_0= rulePrimitiveType ) )
                    // InternalPMDSL.g:283:4: (lv_primitive_1_0= rulePrimitiveType )
                    {
                    // InternalPMDSL.g:283:4: (lv_primitive_1_0= rulePrimitiveType )
                    // InternalPMDSL.g:284:5: lv_primitive_1_0= rulePrimitiveType
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPrimitivePrimitiveTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_1_0=rulePrimitiveType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_1_0,
                    						"org.xtext.example.mydsl.PMDSL.PrimitiveType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalPMDSL.g:305:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // InternalPMDSL.g:305:53: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalPMDSL.g:306:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalPMDSL.g:312:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'number' | kw= 'string' | kw= 'boolean' | kw= 'date' | kw= 'number[]' | kw= 'string[]' | kw= 'boolean[]' | kw= 'date[]' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPMDSL.g:318:2: ( (kw= 'number' | kw= 'string' | kw= 'boolean' | kw= 'date' | kw= 'number[]' | kw= 'string[]' | kw= 'boolean[]' | kw= 'date[]' ) )
            // InternalPMDSL.g:319:2: (kw= 'number' | kw= 'string' | kw= 'boolean' | kw= 'date' | kw= 'number[]' | kw= 'string[]' | kw= 'boolean[]' | kw= 'date[]' )
            {
            // InternalPMDSL.g:319:2: (kw= 'number' | kw= 'string' | kw= 'boolean' | kw= 'date' | kw= 'number[]' | kw= 'string[]' | kw= 'boolean[]' | kw= 'date[]' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            case 22:
                {
                alt5=7;
                }
                break;
            case 23:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPMDSL.g:320:3: kw= 'number'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getNumberKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPMDSL.g:326:3: kw= 'string'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPMDSL.g:332:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPMDSL.g:338:3: kw= 'date'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDateKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPMDSL.g:344:3: kw= 'number[]'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getNumberKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPMDSL.g:350:3: kw= 'string[]'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPMDSL.g:356:3: kw= 'boolean[]'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalPMDSL.g:362:3: kw= 'date[]'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDateKeyword_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleRelation"
    // InternalPMDSL.g:371:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalPMDSL.g:371:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalPMDSL.g:372:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalPMDSL.g:378:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relations' otherlv_1= '{' ( (lv_relationsList_2_0= ruleRelationElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_relationsList_2_0 = null;



        	enterRule();

        try {
            // InternalPMDSL.g:384:2: ( (otherlv_0= 'relations' otherlv_1= '{' ( (lv_relationsList_2_0= ruleRelationElement ) )* otherlv_3= '}' ) )
            // InternalPMDSL.g:385:2: (otherlv_0= 'relations' otherlv_1= '{' ( (lv_relationsList_2_0= ruleRelationElement ) )* otherlv_3= '}' )
            {
            // InternalPMDSL.g:385:2: (otherlv_0= 'relations' otherlv_1= '{' ( (lv_relationsList_2_0= ruleRelationElement ) )* otherlv_3= '}' )
            // InternalPMDSL.g:386:3: otherlv_0= 'relations' otherlv_1= '{' ( (lv_relationsList_2_0= ruleRelationElement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPMDSL.g:394:3: ( (lv_relationsList_2_0= ruleRelationElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPMDSL.g:395:4: (lv_relationsList_2_0= ruleRelationElement )
            	    {
            	    // InternalPMDSL.g:395:4: (lv_relationsList_2_0= ruleRelationElement )
            	    // InternalPMDSL.g:396:5: lv_relationsList_2_0= ruleRelationElement
            	    {

            	    					newCompositeNode(grammarAccess.getRelationAccess().getRelationsListRelationElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_relationsList_2_0=ruleRelationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationsList",
            	    						lv_relationsList_2_0,
            	    						"org.xtext.example.mydsl.PMDSL.RelationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationElement"
    // InternalPMDSL.g:421:1: entryRuleRelationElement returns [EObject current=null] : iv_ruleRelationElement= ruleRelationElement EOF ;
    public final EObject entryRuleRelationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationElement = null;


        try {
            // InternalPMDSL.g:421:56: (iv_ruleRelationElement= ruleRelationElement EOF )
            // InternalPMDSL.g:422:2: iv_ruleRelationElement= ruleRelationElement EOF
            {
             newCompositeNode(grammarAccess.getRelationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationElement=ruleRelationElement();

            state._fsp--;

             current =iv_ruleRelationElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationElement"


    // $ANTLR start "ruleRelationElement"
    // InternalPMDSL.g:428:1: ruleRelationElement returns [EObject current=null] : ( ( (lv_entity1_0_0= RULE_ID ) ) ( (lv_cardinality1_1_0= ruleCardinality ) ) otherlv_2= '-' ( (lv_cardinality2_3_0= ruleCardinality ) ) ( (lv_entity2_4_0= RULE_ID ) ) ) ;
    public final EObject ruleRelationElement() throws RecognitionException {
        EObject current = null;

        Token lv_entity1_0_0=null;
        Token otherlv_2=null;
        Token lv_entity2_4_0=null;
        AntlrDatatypeRuleToken lv_cardinality1_1_0 = null;

        AntlrDatatypeRuleToken lv_cardinality2_3_0 = null;



        	enterRule();

        try {
            // InternalPMDSL.g:434:2: ( ( ( (lv_entity1_0_0= RULE_ID ) ) ( (lv_cardinality1_1_0= ruleCardinality ) ) otherlv_2= '-' ( (lv_cardinality2_3_0= ruleCardinality ) ) ( (lv_entity2_4_0= RULE_ID ) ) ) )
            // InternalPMDSL.g:435:2: ( ( (lv_entity1_0_0= RULE_ID ) ) ( (lv_cardinality1_1_0= ruleCardinality ) ) otherlv_2= '-' ( (lv_cardinality2_3_0= ruleCardinality ) ) ( (lv_entity2_4_0= RULE_ID ) ) )
            {
            // InternalPMDSL.g:435:2: ( ( (lv_entity1_0_0= RULE_ID ) ) ( (lv_cardinality1_1_0= ruleCardinality ) ) otherlv_2= '-' ( (lv_cardinality2_3_0= ruleCardinality ) ) ( (lv_entity2_4_0= RULE_ID ) ) )
            // InternalPMDSL.g:436:3: ( (lv_entity1_0_0= RULE_ID ) ) ( (lv_cardinality1_1_0= ruleCardinality ) ) otherlv_2= '-' ( (lv_cardinality2_3_0= ruleCardinality ) ) ( (lv_entity2_4_0= RULE_ID ) )
            {
            // InternalPMDSL.g:436:3: ( (lv_entity1_0_0= RULE_ID ) )
            // InternalPMDSL.g:437:4: (lv_entity1_0_0= RULE_ID )
            {
            // InternalPMDSL.g:437:4: (lv_entity1_0_0= RULE_ID )
            // InternalPMDSL.g:438:5: lv_entity1_0_0= RULE_ID
            {
            lv_entity1_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_entity1_0_0, grammarAccess.getRelationElementAccess().getEntity1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPMDSL.g:454:3: ( (lv_cardinality1_1_0= ruleCardinality ) )
            // InternalPMDSL.g:455:4: (lv_cardinality1_1_0= ruleCardinality )
            {
            // InternalPMDSL.g:455:4: (lv_cardinality1_1_0= ruleCardinality )
            // InternalPMDSL.g:456:5: lv_cardinality1_1_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationElementAccess().getCardinality1CardinalityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_cardinality1_1_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationElementRule());
            					}
            					set(
            						current,
            						"cardinality1",
            						lv_cardinality1_1_0,
            						"org.xtext.example.mydsl.PMDSL.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationElementAccess().getHyphenMinusKeyword_2());
            		
            // InternalPMDSL.g:477:3: ( (lv_cardinality2_3_0= ruleCardinality ) )
            // InternalPMDSL.g:478:4: (lv_cardinality2_3_0= ruleCardinality )
            {
            // InternalPMDSL.g:478:4: (lv_cardinality2_3_0= ruleCardinality )
            // InternalPMDSL.g:479:5: lv_cardinality2_3_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationElementAccess().getCardinality2CardinalityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_cardinality2_3_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationElementRule());
            					}
            					set(
            						current,
            						"cardinality2",
            						lv_cardinality2_3_0,
            						"org.xtext.example.mydsl.PMDSL.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPMDSL.g:496:3: ( (lv_entity2_4_0= RULE_ID ) )
            // InternalPMDSL.g:497:4: (lv_entity2_4_0= RULE_ID )
            {
            // InternalPMDSL.g:497:4: (lv_entity2_4_0= RULE_ID )
            // InternalPMDSL.g:498:5: lv_entity2_4_0= RULE_ID
            {
            lv_entity2_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_entity2_4_0, grammarAccess.getRelationElementAccess().getEntity2IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationElement"


    // $ANTLR start "entryRuleCardinality"
    // InternalPMDSL.g:518:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalPMDSL.g:518:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalPMDSL.g:519:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalPMDSL.g:525:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '*' | kw= '1-*' | kw= '1-1' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPMDSL.g:531:2: ( (kw= '1' | kw= '*' | kw= '1-*' | kw= '1-1' ) )
            // InternalPMDSL.g:532:2: (kw= '1' | kw= '*' | kw= '1-*' | kw= '1-1' )
            {
            // InternalPMDSL.g:532:2: (kw= '1' | kw= '*' | kw= '1-*' | kw= '1-1' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPMDSL.g:533:3: kw= '1'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPMDSL.g:539:3: kw= '*'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPMDSL.g:545:3: kw= '1-*'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneHyphenMinusAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPMDSL.g:551:3: kw= '1-1'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneHyphenMinusDigitOneKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});

}