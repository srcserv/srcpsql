// $ANTLR 3.4 /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g 2012-12-03 12:13:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class psqlgrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int Asterisk=4;
    public static final int BETWEEN=5;
    public static final int Basic_Latin_Without_Quotes=6;
    public static final int Character_String_Literal=7;
    public static final int Comma=8;
    public static final int Concatenation_Operator=9;
    public static final int Dash=10;
    public static final int Digit=11;
    public static final int Equals_Operator=12;
    public static final int Extended_Latin_Without_Quotes=13;
    public static final int Greater_Or_Equals_Operator=14;
    public static final int Greater_Than_Operator=15;
    public static final int IS=16;
    public static final int Left_Paren=17;
    public static final int Less_Or_Equals_Operator=18;
    public static final int Less_Than_Operator=19;
    public static final int Minus_Sign=20;
    public static final int NEWLINE=21;
    public static final int NOT=22;
    public static final int Not_Equals_Operator=23;
    public static final int POLYMORPHIC=24;
    public static final int Percent=25;
    public static final int Period=26;
    public static final int Plus_Sign=27;
    public static final int Quote=28;
    public static final int Regular_Identifier=29;
    public static final int Right_Arrow=30;
    public static final int Right_Paren=31;
    public static final int SQL92_Identifier=32;
    public static final int SQL92_Identifier_Part=33;
    public static final int SQL92_Identifier_Start=34;
    public static final int Simple_Latin_Letter=35;
    public static final int Simple_Latin_Lower_Case_Letter=36;
    public static final int Simple_Latin_Upper_Case_Letter=37;
    public static final int Single_Quote=38;
    public static final int Slash=39;
    public static final int Underscore=40;
    public static final int Unsigned_Integer=41;
    public static final int Unsigned_Integer2=42;
    public static final int WS=43;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public psqlgrammarLexer() {} 
    public psqlgrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public psqlgrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g"; }

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:7:9: ( 'BETWEEN' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:7:11: 'BETWEEN'
            {
            match("BETWEEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:8:4: ( 'IS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:8:6: 'IS'
            {
            match("IS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:9:5: ( 'NOT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:9:7: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "POLYMORPHIC"
    public final void mPOLYMORPHIC() throws RecognitionException {
        try {
            int _type = POLYMORPHIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:10:13: ( 'POLYMORPHIC' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:10:15: 'POLYMORPHIC'
            {
            match("POLYMORPHIC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POLYMORPHIC"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:11:7: ( 'ABS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:11:9: 'ABS'
            {
            match("ABS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:12:7: ( 'AGI CLONE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:12:9: 'AGI CLONE'
            {
            match("AGI CLONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:13:7: ( 'ALL' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:13:9: 'ALL'
            {
            match("ALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:14:7: ( 'AND' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:14:9: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:15:7: ( 'ANY' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:15:9: 'ANY'
            {
            match("ANY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:16:7: ( 'AS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:16:9: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:17:7: ( 'ASC' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:17:9: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:18:7: ( 'ASYMMETRIC' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:18:9: 'ASYMMETRIC'
            {
            match("ASYMMETRIC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:19:7: ( 'AVG' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:19:9: 'AVG'
            {
            match("AVG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:20:7: ( 'BERNOULLI' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:20:9: 'BERNOULLI'
            {
            match("BERNOULLI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:21:7: ( 'BOTH' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:21:9: 'BOTH'
            {
            match("BOTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:22:7: ( 'BY' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:22:9: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:23:7: ( 'CHARACTERS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:23:9: 'CHARACTERS'
            {
            match("CHARACTERS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:24:7: ( 'CHROMOSOME' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:24:9: 'CHROMOSOME'
            {
            match("CHROMOSOME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:25:7: ( 'CODE_UNITS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:25:9: 'CODE_UNITS'
            {
            match("CODE_UNITS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:26:7: ( 'COLLATE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:26:9: 'COLLATE'
            {
            match("COLLATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:27:7: ( 'COLLECT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:27:9: 'COLLECT'
            {
            match("COLLECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:28:7: ( 'COUNT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:28:9: 'COUNT'
            {
            match("COUNT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:29:7: ( 'CROSS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:29:9: 'CROSS'
            {
            match("CROSS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:30:7: ( 'CUBE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:30:9: 'CUBE'
            {
            match("CUBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:31:7: ( 'DESC' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:31:9: 'DESC'
            {
            match("DESC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:32:7: ( 'DISTINCT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:32:9: 'DISTINCT'
            {
            match("DISTINCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:33:7: ( 'ESCAPE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:33:9: 'ESCAPE'
            {
            match("ESCAPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:34:7: ( 'EVERY' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:34:9: 'EVERY'
            {
            match("EVERY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:35:7: ( 'EXCEPT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:35:9: 'EXCEPT'
            {
            match("EXCEPT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:36:7: ( 'EXCLUSIVE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:36:9: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:37:7: ( 'FALSE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:37:9: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:38:7: ( 'FILTER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:38:9: 'FILTER'
            {
            match("FILTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:39:7: ( 'FIRST' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:39:9: 'FIRST'
            {
            match("FIRST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:40:7: ( 'FOR' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:40:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:41:7: ( 'FROM' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:41:9: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:42:7: ( 'FULL' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:42:9: 'FULL'
            {
            match("FULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:43:7: ( 'FUSION' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:43:9: 'FUSION'
            {
            match("FUSION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:44:7: ( 'GROUP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:44:9: 'GROUP'
            {
            match("GROUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:45:7: ( 'GROUPING' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:45:9: 'GROUPING'
            {
            match("GROUPING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:46:7: ( 'HAVING' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:46:9: 'HAVING'
            {
            match("HAVING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:47:7: ( 'IN' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:47:9: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:48:7: ( 'INCLUSIVE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:48:9: 'INCLUSIVE'
            {
            match("INCLUSIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:49:7: ( 'INNER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:49:9: 'INNER'
            {
            match("INNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:50:7: ( 'INTERSECT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:50:9: 'INTERSECT'
            {
            match("INTERSECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:7: ( 'INTERSECTION' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:9: 'INTERSECTION'
            {
            match("INTERSECTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:52:7: ( 'IS-A' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:52:9: 'IS-A'
            {
            match("IS-A"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:53:7: ( 'JOIN' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:53:9: 'JOIN'
            {
            match("JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:54:7: ( 'KB' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:54:9: 'KB'
            {
            match("KB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:55:7: ( 'LAST' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:55:9: 'LAST'
            {
            match("LAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:56:7: ( 'LEADING' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:56:9: 'LEADING'
            {
            match("LEADING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:57:7: ( 'LEFT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:57:9: 'LEFT'
            {
            match("LEFT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:58:7: ( 'LIKE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:58:9: 'LIKE'
            {
            match("LIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:59:7: ( 'LOCUS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:59:9: 'LOCUS'
            {
            match("LOCUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:60:7: ( 'LOWER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:60:9: 'LOWER'
            {
            match("LOWER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:61:7: ( 'MAP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:61:9: 'MAP'
            {
            match("MAP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:62:7: ( 'MARKER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:62:9: 'MARKER'
            {
            match("MARKER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:63:7: ( 'MAX' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:63:9: 'MAX'
            {
            match("MAX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:64:7: ( 'MIN' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:64:9: 'MIN'
            {
            match("MIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:65:7: ( 'MODULE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:65:9: 'MODULE'
            {
            match("MODULE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:66:7: ( 'NATURAL' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:66:9: 'NATURAL'
            {
            match("NATURAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:67:8: ( 'NULLS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:67:10: 'NULLS'
            {
            match("NULLS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:68:8: ( 'OCTETS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:68:10: 'OCTETS'
            {
            match("OCTETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:69:8: ( 'ON' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:69:10: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:70:8: ( 'ONTOLOGY' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:70:10: 'ONTOLOGY'
            {
            match("ONTOLOGY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:71:8: ( 'OR' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:71:10: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:72:8: ( 'ORDER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:72:10: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:73:8: ( 'OTHER CLONE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:73:10: 'OTHER CLONE'
            {
            match("OTHER CLONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:74:8: ( 'OUTER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:74:10: 'OUTER'
            {
            match("OUTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:75:8: ( 'PART-OF' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:75:10: 'PART-OF'
            {
            match("PART-OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:76:8: ( 'REFERENCE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:76:10: 'REFERENCE'
            {
            match("REFERENCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:77:8: ( 'REGULATES' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:77:10: 'REGULATES'
            {
            match("REGULATES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:78:8: ( 'REPEATABLE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:78:10: 'REPEATABLE'
            {
            match("REPEATABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:79:8: ( 'RIGHT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:79:10: 'RIGHT'
            {
            match("RIGHT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:80:8: ( 'ROLLUP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:80:10: 'ROLLUP'
            {
            match("ROLLUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:81:8: ( 'ROW' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:81:10: 'ROW'
            {
            match("ROW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:82:8: ( 'SELECT' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:82:10: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:83:8: ( 'SETS' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:83:10: 'SETS'
            {
            match("SETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:84:8: ( 'SIMILAR' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:84:10: 'SIMILAR'
            {
            match("SIMILAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:85:8: ( 'SOME' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:85:10: 'SOME'
            {
            match("SOME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:86:8: ( 'STDDEV_POP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:86:10: 'STDDEV_POP'
            {
            match("STDDEV_POP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:87:8: ( 'STDDEV_SAMP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:87:10: 'STDDEV_SAMP'
            {
            match("STDDEV_SAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:88:8: ( 'SUBSTRING' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:88:10: 'SUBSTRING'
            {
            match("SUBSTRING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:89:8: ( 'SUM' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:89:10: 'SUM'
            {
            match("SUM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:90:8: ( 'SYMMETRIC' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:90:10: 'SYMMETRIC'
            {
            match("SYMMETRIC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:91:8: ( 'SYSTEM' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:91:10: 'SYSTEM'
            {
            match("SYSTEM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:92:8: ( 'TABLESAMPLE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:92:10: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:93:8: ( 'TRAILING' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:93:10: 'TRAILING'
            {
            match("TRAILING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:94:8: ( 'TRIM' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:94:10: 'TRIM'
            {
            match("TRIM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:95:8: ( 'TRUE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:95:10: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:96:8: ( 'UNION' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:96:10: 'UNION'
            {
            match("UNION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:97:8: ( 'UNKNOWN' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:97:10: 'UNKNOWN'
            {
            match("UNKNOWN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:98:8: ( 'UPPER' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:98:10: 'UPPER'
            {
            match("UPPER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:99:8: ( 'USING' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:99:10: 'USING'
            {
            match("USING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:100:8: ( 'VAR_POP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:100:10: 'VAR_POP'
            {
            match("VAR_POP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:101:8: ( 'VAR_SAMP' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:101:10: 'VAR_SAMP'
            {
            match("VAR_SAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:102:8: ( 'WHERE' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:102:10: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "Character_String_Literal"
    public final void mCharacter_String_Literal() throws RecognitionException {
        try {
            int _type = Character_String_Literal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1087:26: ( Single_Quote Basic_Latin_Without_Quotes Single_Quote )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1088:4: Single_Quote Basic_Latin_Without_Quotes Single_Quote
            {
            mSingle_Quote(); 


            mBasic_Latin_Without_Quotes(); 


            mSingle_Quote(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Character_String_Literal"

    // $ANTLR start "Equals_Operator"
    public final void mEquals_Operator() throws RecognitionException {
        try {
            int _type = Equals_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1498:2: ( '=' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1498:5: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Equals_Operator"

    // $ANTLR start "Not_Equals_Operator"
    public final void mNot_Equals_Operator() throws RecognitionException {
        try {
            int _type = Not_Equals_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1501:2: ( '<>' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1501:5: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Not_Equals_Operator"

    // $ANTLR start "Less_Than_Operator"
    public final void mLess_Than_Operator() throws RecognitionException {
        try {
            int _type = Less_Than_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1504:2: ( '<' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1504:5: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Less_Than_Operator"

    // $ANTLR start "Greater_Than_Operator"
    public final void mGreater_Than_Operator() throws RecognitionException {
        try {
            int _type = Greater_Than_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1507:2: ( '>' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1507:5: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Greater_Than_Operator"

    // $ANTLR start "Less_Or_Equals_Operator"
    public final void mLess_Or_Equals_Operator() throws RecognitionException {
        try {
            int _type = Less_Or_Equals_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1510:2: ( '<=' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1510:5: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Less_Or_Equals_Operator"

    // $ANTLR start "Greater_Or_Equals_Operator"
    public final void mGreater_Or_Equals_Operator() throws RecognitionException {
        try {
            int _type = Greater_Or_Equals_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1513:2: ( '>=' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1513:5: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Greater_Or_Equals_Operator"

    // $ANTLR start "Unsigned_Integer"
    public final void mUnsigned_Integer() throws RecognitionException {
        try {
            int _type = Unsigned_Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1515:18: ( ( '1' .. '9' ) ( Digit )* )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1515:20: ( '1' .. '9' ) ( Digit )*
            {
            if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1515:33: ( Digit )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Unsigned_Integer"

    // $ANTLR start "Unsigned_Integer2"
    public final void mUnsigned_Integer2() throws RecognitionException {
        try {
            int _type = Unsigned_Integer2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1517:19: ( ( '0' .. '9' ) ( Digit )* )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1517:21: ( '0' .. '9' ) ( Digit )*
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1517:34: ( Digit )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Unsigned_Integer2"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1521:8: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Regular_Identifier"
    public final void mRegular_Identifier() throws RecognitionException {
        try {
            int _type = Regular_Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1522:21: ( SQL92_Identifier )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1522:24: SQL92_Identifier
            {
            mSQL92_Identifier(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Regular_Identifier"

    // $ANTLR start "SQL92_Identifier"
    public final void mSQL92_Identifier() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1526:19: ( SQL92_Identifier_Start ( SQL92_Identifier_Part )* )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1526:22: SQL92_Identifier_Start ( SQL92_Identifier_Part )*
            {
            mSQL92_Identifier_Start(); 


            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1526:45: ( SQL92_Identifier_Part )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='%'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            	    {
            	    if ( input.LA(1)=='%'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_Identifier"

    // $ANTLR start "SQL92_Identifier_Start"
    public final void mSQL92_Identifier_Start() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1528:25: ( Simple_Latin_Letter | Percent | Digit )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( input.LA(1)=='%'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_Identifier_Start"

    // $ANTLR start "SQL92_Identifier_Part"
    public final void mSQL92_Identifier_Part() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1532:24: ( Simple_Latin_Letter | Underscore | Percent | Digit )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( input.LA(1)=='%'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_Identifier_Part"

    // $ANTLR start "Simple_Latin_Letter"
    public final void mSimple_Latin_Letter() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1533:22: ( Simple_Latin_Upper_Case_Letter | Simple_Latin_Lower_Case_Letter )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Simple_Latin_Letter"

    // $ANTLR start "Simple_Latin_Upper_Case_Letter"
    public final void mSimple_Latin_Upper_Case_Letter() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1536:32: ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Simple_Latin_Upper_Case_Letter"

    // $ANTLR start "Simple_Latin_Lower_Case_Letter"
    public final void mSimple_Latin_Lower_Case_Letter() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1541:32: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Simple_Latin_Lower_Case_Letter"

    // $ANTLR start "Underscore"
    public final void mUnderscore() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1546:12: ( '_' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1546:14: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Underscore"

    // $ANTLR start "Dash"
    public final void mDash() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1548:6: ( '-' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1548:8: '-'
            {
            match('-'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Dash"

    // $ANTLR start "Percent"
    public final void mPercent() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1551:2: ( '\\%' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1551:3: '\\%'
            {
            match('%'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Percent"

    // $ANTLR start "Left_Paren"
    public final void mLeft_Paren() throws RecognitionException {
        try {
            int _type = Left_Paren;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1552:25: ( '(' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1552:28: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Left_Paren"

    // $ANTLR start "Right_Paren"
    public final void mRight_Paren() throws RecognitionException {
        try {
            int _type = Right_Paren;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1553:24: ( ')' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1553:27: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Right_Paren"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1556:2: ( ',' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1556:5: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1559:2: ( '*' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1559:5: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "Concatenation_Operator"
    public final void mConcatenation_Operator() throws RecognitionException {
        try {
            int _type = Concatenation_Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1562:2: ( '\\|\\|' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1562:5: '\\|\\|'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Concatenation_Operator"

    // $ANTLR start "Period"
    public final void mPeriod() throws RecognitionException {
        try {
            int _type = Period;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1564:2: ( '.' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1564:5: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Period"

    // $ANTLR start "Right_Arrow"
    public final void mRight_Arrow() throws RecognitionException {
        try {
            int _type = Right_Arrow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1569:2: ( '->' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1569:5: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Right_Arrow"

    // $ANTLR start "Plus_Sign"
    public final void mPlus_Sign() throws RecognitionException {
        try {
            int _type = Plus_Sign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1572:2: ( '+' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1572:5: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Plus_Sign"

    // $ANTLR start "Minus_Sign"
    public final void mMinus_Sign() throws RecognitionException {
        try {
            int _type = Minus_Sign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1574:2: ( '-' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1574:5: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Minus_Sign"

    // $ANTLR start "Slash"
    public final void mSlash() throws RecognitionException {
        try {
            int _type = Slash;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1576:2: ( '/' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1576:5: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Slash"

    // $ANTLR start "Quote"
    public final void mQuote() throws RecognitionException {
        try {
            int _type = Quote;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1579:2: ( '\\\\' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1579:5: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Quote"

    // $ANTLR start "Single_Quote"
    public final void mSingle_Quote() throws RecognitionException {
        try {
            int _type = Single_Quote;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1585:14: ( '\\'' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1585:16: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Single_Quote"

    // $ANTLR start "Extended_Latin_Without_Quotes"
    public final void mExtended_Latin_Without_Quotes() throws RecognitionException {
        try {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1595:37: ( '\\u0001' .. '!' | '#' .. '&' | '(' .. '\\u00FF' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( (input.LA(1) >= '\u0001' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\u00FF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Extended_Latin_Without_Quotes"

    // $ANTLR start "Basic_Latin_Without_Quotes"
    public final void mBasic_Latin_Without_Quotes() throws RecognitionException {
        try {
            int _type = Basic_Latin_Without_Quotes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1597:37: ( '#' .. '&' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            if ( (input.LA(1) >= '#' && input.LA(1) <= '&') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Basic_Latin_Without_Quotes"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1599:9: ( ( '\\r' )? '\\n' )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1599:11: ( '\\r' )? '\\n'
            {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1599:11: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1599:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            skip();

            match('\n'); 

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1602:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1602:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1602:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:8: ( BETWEEN | IS | NOT | POLYMORPHIC | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | Character_String_Literal | Equals_Operator | Not_Equals_Operator | Less_Than_Operator | Greater_Than_Operator | Less_Or_Equals_Operator | Greater_Or_Equals_Operator | Unsigned_Integer | Unsigned_Integer2 | Regular_Identifier | Left_Paren | Right_Paren | Comma | Asterisk | Concatenation_Operator | Period | Right_Arrow | Plus_Sign | Minus_Sign | Slash | Quote | Single_Quote | Basic_Latin_Without_Quotes | NEWLINE | WS )
        int alt6=121;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:10: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 2 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:18: IS
                {
                mIS(); 


                }
                break;
            case 3 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:21: NOT
                {
                mNOT(); 


                }
                break;
            case 4 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:25: POLYMORPHIC
                {
                mPOLYMORPHIC(); 


                }
                break;
            case 5 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:37: T__44
                {
                mT__44(); 


                }
                break;
            case 6 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:43: T__45
                {
                mT__45(); 


                }
                break;
            case 7 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:49: T__46
                {
                mT__46(); 


                }
                break;
            case 8 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:55: T__47
                {
                mT__47(); 


                }
                break;
            case 9 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:61: T__48
                {
                mT__48(); 


                }
                break;
            case 10 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:67: T__49
                {
                mT__49(); 


                }
                break;
            case 11 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:73: T__50
                {
                mT__50(); 


                }
                break;
            case 12 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:79: T__51
                {
                mT__51(); 


                }
                break;
            case 13 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:85: T__52
                {
                mT__52(); 


                }
                break;
            case 14 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:91: T__53
                {
                mT__53(); 


                }
                break;
            case 15 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:97: T__54
                {
                mT__54(); 


                }
                break;
            case 16 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:103: T__55
                {
                mT__55(); 


                }
                break;
            case 17 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:109: T__56
                {
                mT__56(); 


                }
                break;
            case 18 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:115: T__57
                {
                mT__57(); 


                }
                break;
            case 19 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:121: T__58
                {
                mT__58(); 


                }
                break;
            case 20 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:127: T__59
                {
                mT__59(); 


                }
                break;
            case 21 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:133: T__60
                {
                mT__60(); 


                }
                break;
            case 22 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:139: T__61
                {
                mT__61(); 


                }
                break;
            case 23 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:145: T__62
                {
                mT__62(); 


                }
                break;
            case 24 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:151: T__63
                {
                mT__63(); 


                }
                break;
            case 25 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:157: T__64
                {
                mT__64(); 


                }
                break;
            case 26 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:163: T__65
                {
                mT__65(); 


                }
                break;
            case 27 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:169: T__66
                {
                mT__66(); 


                }
                break;
            case 28 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:175: T__67
                {
                mT__67(); 


                }
                break;
            case 29 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:181: T__68
                {
                mT__68(); 


                }
                break;
            case 30 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:187: T__69
                {
                mT__69(); 


                }
                break;
            case 31 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:193: T__70
                {
                mT__70(); 


                }
                break;
            case 32 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:199: T__71
                {
                mT__71(); 


                }
                break;
            case 33 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:205: T__72
                {
                mT__72(); 


                }
                break;
            case 34 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:211: T__73
                {
                mT__73(); 


                }
                break;
            case 35 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:217: T__74
                {
                mT__74(); 


                }
                break;
            case 36 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:223: T__75
                {
                mT__75(); 


                }
                break;
            case 37 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:229: T__76
                {
                mT__76(); 


                }
                break;
            case 38 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:235: T__77
                {
                mT__77(); 


                }
                break;
            case 39 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:241: T__78
                {
                mT__78(); 


                }
                break;
            case 40 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:247: T__79
                {
                mT__79(); 


                }
                break;
            case 41 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:253: T__80
                {
                mT__80(); 


                }
                break;
            case 42 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:259: T__81
                {
                mT__81(); 


                }
                break;
            case 43 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:265: T__82
                {
                mT__82(); 


                }
                break;
            case 44 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:271: T__83
                {
                mT__83(); 


                }
                break;
            case 45 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:277: T__84
                {
                mT__84(); 


                }
                break;
            case 46 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:283: T__85
                {
                mT__85(); 


                }
                break;
            case 47 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:289: T__86
                {
                mT__86(); 


                }
                break;
            case 48 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:295: T__87
                {
                mT__87(); 


                }
                break;
            case 49 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:301: T__88
                {
                mT__88(); 


                }
                break;
            case 50 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:307: T__89
                {
                mT__89(); 


                }
                break;
            case 51 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:313: T__90
                {
                mT__90(); 


                }
                break;
            case 52 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:319: T__91
                {
                mT__91(); 


                }
                break;
            case 53 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:325: T__92
                {
                mT__92(); 


                }
                break;
            case 54 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:331: T__93
                {
                mT__93(); 


                }
                break;
            case 55 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:337: T__94
                {
                mT__94(); 


                }
                break;
            case 56 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:343: T__95
                {
                mT__95(); 


                }
                break;
            case 57 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:349: T__96
                {
                mT__96(); 


                }
                break;
            case 58 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:355: T__97
                {
                mT__97(); 


                }
                break;
            case 59 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:361: T__98
                {
                mT__98(); 


                }
                break;
            case 60 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:367: T__99
                {
                mT__99(); 


                }
                break;
            case 61 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:373: T__100
                {
                mT__100(); 


                }
                break;
            case 62 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:380: T__101
                {
                mT__101(); 


                }
                break;
            case 63 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:387: T__102
                {
                mT__102(); 


                }
                break;
            case 64 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:394: T__103
                {
                mT__103(); 


                }
                break;
            case 65 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:401: T__104
                {
                mT__104(); 


                }
                break;
            case 66 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:408: T__105
                {
                mT__105(); 


                }
                break;
            case 67 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:415: T__106
                {
                mT__106(); 


                }
                break;
            case 68 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:422: T__107
                {
                mT__107(); 


                }
                break;
            case 69 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:429: T__108
                {
                mT__108(); 


                }
                break;
            case 70 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:436: T__109
                {
                mT__109(); 


                }
                break;
            case 71 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:443: T__110
                {
                mT__110(); 


                }
                break;
            case 72 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:450: T__111
                {
                mT__111(); 


                }
                break;
            case 73 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:457: T__112
                {
                mT__112(); 


                }
                break;
            case 74 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:464: T__113
                {
                mT__113(); 


                }
                break;
            case 75 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:471: T__114
                {
                mT__114(); 


                }
                break;
            case 76 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:478: T__115
                {
                mT__115(); 


                }
                break;
            case 77 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:485: T__116
                {
                mT__116(); 


                }
                break;
            case 78 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:492: T__117
                {
                mT__117(); 


                }
                break;
            case 79 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:499: T__118
                {
                mT__118(); 


                }
                break;
            case 80 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:506: T__119
                {
                mT__119(); 


                }
                break;
            case 81 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:513: T__120
                {
                mT__120(); 


                }
                break;
            case 82 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:520: T__121
                {
                mT__121(); 


                }
                break;
            case 83 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:527: T__122
                {
                mT__122(); 


                }
                break;
            case 84 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:534: T__123
                {
                mT__123(); 


                }
                break;
            case 85 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:541: T__124
                {
                mT__124(); 


                }
                break;
            case 86 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:548: T__125
                {
                mT__125(); 


                }
                break;
            case 87 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:555: T__126
                {
                mT__126(); 


                }
                break;
            case 88 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:562: T__127
                {
                mT__127(); 


                }
                break;
            case 89 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:569: T__128
                {
                mT__128(); 


                }
                break;
            case 90 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:576: T__129
                {
                mT__129(); 


                }
                break;
            case 91 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:583: T__130
                {
                mT__130(); 


                }
                break;
            case 92 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:590: T__131
                {
                mT__131(); 


                }
                break;
            case 93 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:597: T__132
                {
                mT__132(); 


                }
                break;
            case 94 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:604: T__133
                {
                mT__133(); 


                }
                break;
            case 95 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:611: T__134
                {
                mT__134(); 


                }
                break;
            case 96 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:618: T__135
                {
                mT__135(); 


                }
                break;
            case 97 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:625: Character_String_Literal
                {
                mCharacter_String_Literal(); 


                }
                break;
            case 98 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:650: Equals_Operator
                {
                mEquals_Operator(); 


                }
                break;
            case 99 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:666: Not_Equals_Operator
                {
                mNot_Equals_Operator(); 


                }
                break;
            case 100 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:686: Less_Than_Operator
                {
                mLess_Than_Operator(); 


                }
                break;
            case 101 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:705: Greater_Than_Operator
                {
                mGreater_Than_Operator(); 


                }
                break;
            case 102 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:727: Less_Or_Equals_Operator
                {
                mLess_Or_Equals_Operator(); 


                }
                break;
            case 103 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:751: Greater_Or_Equals_Operator
                {
                mGreater_Or_Equals_Operator(); 


                }
                break;
            case 104 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:778: Unsigned_Integer
                {
                mUnsigned_Integer(); 


                }
                break;
            case 105 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:795: Unsigned_Integer2
                {
                mUnsigned_Integer2(); 


                }
                break;
            case 106 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:813: Regular_Identifier
                {
                mRegular_Identifier(); 


                }
                break;
            case 107 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:832: Left_Paren
                {
                mLeft_Paren(); 


                }
                break;
            case 108 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:843: Right_Paren
                {
                mRight_Paren(); 


                }
                break;
            case 109 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:855: Comma
                {
                mComma(); 


                }
                break;
            case 110 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:861: Asterisk
                {
                mAsterisk(); 


                }
                break;
            case 111 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:870: Concatenation_Operator
                {
                mConcatenation_Operator(); 


                }
                break;
            case 112 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:893: Period
                {
                mPeriod(); 


                }
                break;
            case 113 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:900: Right_Arrow
                {
                mRight_Arrow(); 


                }
                break;
            case 114 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:912: Plus_Sign
                {
                mPlus_Sign(); 


                }
                break;
            case 115 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:922: Minus_Sign
                {
                mMinus_Sign(); 


                }
                break;
            case 116 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:933: Slash
                {
                mSlash(); 


                }
                break;
            case 117 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:939: Quote
                {
                mQuote(); 


                }
                break;
            case 118 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:945: Single_Quote
                {
                mSingle_Quote(); 


                }
                break;
            case 119 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:958: Basic_Latin_Without_Quotes
                {
                mBasic_Latin_Without_Quotes(); 


                }
                break;
            case 120 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:985: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 121 :
                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1:993: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\26\50\1\153\1\uffff\1\157\1\161\1\163\1\165\7\uffff\1\167"+
        "\5\uffff\1\54\1\170\1\uffff\2\50\1\174\1\176\1\u0082\11\50\1\u008f"+
        "\22\50\1\u00a7\10\50\1\u00b5\1\u00b7\22\50\7\uffff\1\163\1\uffff"+
        "\1\165\4\uffff\3\50\3\uffff\3\50\1\uffff\1\u00d9\4\50\1\u00de\1"+
        "\50\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\50\1\uffff\1\u00e5\17\50\1"+
        "\u00f6\6\50\1\uffff\6\50\1\u0103\1\50\1\u0105\1\u0106\3\50\1\uffff"+
        "\1\50\1\uffff\7\50\1\u0112\6\50\1\u0119\16\50\1\u0128\3\50\1\uffff"+
        "\4\50\6\uffff\1\50\1\uffff\6\50\1\u0138\1\u0139\10\50\1\uffff\1"+
        "\u0142\1\u0143\3\50\1\u0147\1\u0148\1\50\1\u014a\1\u014b\2\50\1"+
        "\uffff\1\50\2\uffff\13\50\1\uffff\1\50\1\u015b\1\50\1\u015d\2\50"+
        "\1\uffff\4\50\1\u0164\1\u0165\10\50\1\uffff\1\50\1\u0170\2\50\1"+
        "\u0173\1\50\1\uffff\6\50\1\u017b\1\u017c\2\uffff\2\50\1\u017f\2"+
        "\50\1\u0182\1\50\1\u0184\2\uffff\1\50\1\u0187\1\50\2\uffff\1\50"+
        "\2\uffff\1\u018a\1\u018b\4\50\1\u0190\1\50\1\u0192\3\50\1\u0196"+
        "\2\50\1\uffff\1\50\1\uffff\6\50\2\uffff\1\u01a0\1\50\1\u01a2\1\u01a3"+
        "\2\50\1\u01a6\3\50\1\uffff\2\50\1\uffff\7\50\2\uffff\1\50\1\u01b4"+
        "\1\uffff\1\u01b5\1\50\1\uffff\1\u01b7\1\uffff\1\u01b8\1\50\1\uffff"+
        "\1\u01ba\1\50\2\uffff\1\u01bc\1\u01bd\1\u01be\1\50\3\uffff\3\50"+
        "\1\uffff\1\u01c3\1\u01c4\4\50\1\u01c9\2\50\1\uffff\1\50\2\uffff"+
        "\2\50\1\uffff\1\u01cf\3\50\1\u01d3\5\50\1\u01d9\1\u01da\1\50\2\uffff"+
        "\1\50\2\uffff\1\50\1\uffff\1\u01de\3\uffff\4\50\2\uffff\1\u01e3"+
        "\3\50\1\uffff\2\50\1\u01ea\1\u01eb\1\50\1\uffff\3\50\1\uffff\5\50"+
        "\2\uffff\1\u01f5\1\50\1\u01f7\1\uffff\1\u01f8\3\50\1\uffff\5\50"+
        "\1\u0201\2\uffff\1\u0202\1\u0203\1\u0204\1\u0206\5\50\1\uffff\1"+
        "\u020c\2\uffff\1\u020d\1\u020e\3\50\1\u0212\1\u0213\1\50\4\uffff"+
        "\1\50\1\uffff\1\50\1\u0217\1\u0218\1\u0219\1\u021a\3\uffff\1\u021b"+
        "\1\u021c\1\50\2\uffff\2\50\1\u0220\6\uffff\1\u0221\1\u0222\1\u0223"+
        "\4\uffff";
    static final String DFA6_eofS =
        "\u0224\uffff";
    static final String DFA6_minS =
        "\1\0\1\105\1\116\2\101\1\102\1\110\1\105\1\123\1\101\1\122\1\101"+
        "\1\117\1\102\2\101\1\103\2\105\1\101\1\116\1\101\1\110\1\43\1\uffff"+
        "\2\75\2\45\7\uffff\1\76\5\uffff\1\12\1\11\1\uffff\1\122\1\124\3"+
        "\45\2\124\2\114\1\122\1\123\1\111\1\114\1\104\1\45\1\107\1\101\1"+
        "\104\1\117\1\102\2\123\1\103\1\105\1\103\2\114\1\122\1\117\1\114"+
        "\1\117\1\126\1\111\1\45\1\123\1\101\1\113\1\103\1\120\1\116\1\104"+
        "\1\124\2\45\1\110\1\124\1\106\1\107\2\114\2\115\1\104\1\102\1\115"+
        "\1\102\1\101\1\111\1\120\1\111\1\122\1\105\7\uffff\1\45\1\uffff"+
        "\1\45\4\uffff\1\127\1\116\1\110\3\uffff\1\114\2\105\1\uffff\1\45"+
        "\1\125\1\114\1\131\1\124\1\45\1\40\4\45\1\115\1\uffff\1\45\1\122"+
        "\1\117\1\105\1\114\1\116\1\123\1\105\1\103\1\124\1\101\1\122\1\105"+
        "\1\123\1\124\1\123\1\45\1\115\1\114\1\111\1\125\1\111\1\116\1\uffff"+
        "\1\124\1\104\1\124\1\105\1\125\1\105\1\45\1\113\2\45\1\125\1\105"+
        "\1\117\1\uffff\1\105\1\uffff\3\105\1\125\1\105\1\110\1\114\1\45"+
        "\1\105\1\123\1\111\1\105\1\104\1\123\1\45\1\115\1\124\1\114\1\111"+
        "\1\115\1\105\1\117\1\116\1\105\1\116\1\137\1\122\1\105\1\117\1\45"+
        "\1\125\2\122\1\uffff\1\122\1\123\1\115\1\55\6\uffff\1\115\1\uffff"+
        "\1\101\1\115\1\137\1\101\1\124\1\123\2\45\1\111\1\120\1\131\1\120"+
        "\1\125\2\105\1\124\1\uffff\2\45\1\117\1\120\1\116\2\45\1\111\2\45"+
        "\1\123\1\122\1\uffff\1\105\2\uffff\1\114\1\124\1\114\4\122\1\114"+
        "\1\101\1\124\1\125\1\uffff\1\103\1\45\1\114\1\45\1\105\1\124\1\uffff"+
        "\3\105\1\114\2\45\1\116\1\117\1\122\1\107\1\120\2\105\1\125\1\uffff"+
        "\1\123\1\45\1\123\1\101\1\45\1\117\1\uffff\1\105\1\103\1\117\1\125"+
        "\1\124\1\103\2\45\2\uffff\1\116\1\105\1\45\1\124\1\123\1\45\1\122"+
        "\1\45\2\uffff\1\116\1\45\1\107\2\uffff\1\116\2\uffff\2\45\1\122"+
        "\1\105\1\123\1\117\1\45\1\40\1\45\1\105\1\101\1\124\1\45\1\120\1"+
        "\124\1\uffff\1\101\1\uffff\1\126\1\122\1\124\1\115\1\123\1\111\2"+
        "\uffff\1\45\1\127\2\45\1\117\1\101\1\45\1\116\1\114\1\111\1\uffff"+
        "\1\105\1\114\1\uffff\1\122\2\124\1\123\1\116\1\105\1\124\2\uffff"+
        "\1\103\1\45\1\uffff\1\45\1\111\1\uffff\1\45\1\uffff\1\45\1\116\1"+
        "\uffff\1\45\1\107\2\uffff\3\45\1\107\3\uffff\1\116\1\124\1\101\1"+
        "\uffff\2\45\1\122\1\137\1\111\1\122\1\45\1\101\1\116\1\uffff\1\116"+
        "\2\uffff\1\120\1\115\1\uffff\1\45\1\114\1\126\1\103\1\45\1\120\1"+
        "\122\1\105\1\117\1\111\2\45\1\124\2\uffff\1\126\2\uffff\1\107\1"+
        "\uffff\1\45\3\uffff\1\131\1\103\1\105\1\102\2\uffff\1\45\1\120\1"+
        "\116\1\111\1\uffff\1\115\1\107\2\45\1\120\1\uffff\1\111\1\105\1"+
        "\124\1\uffff\1\110\1\111\1\122\1\115\1\124\2\uffff\1\45\1\105\1"+
        "\45\1\uffff\1\45\1\105\1\123\1\114\1\uffff\1\117\1\101\1\107\1\103"+
        "\1\120\1\45\2\uffff\4\45\1\111\1\103\1\123\1\105\1\123\1\uffff\1"+
        "\45\2\uffff\2\45\1\105\1\120\1\115\2\45\1\114\4\uffff\1\117\1\uffff"+
        "\1\103\4\45\3\uffff\2\45\1\120\2\uffff\1\105\1\116\1\45\6\uffff"+
        "\3\45\4\uffff";
    static final String DFA6_maxS =
        "\1\172\1\131\1\123\1\125\1\117\1\126\1\125\1\111\1\130\1\125\1\122"+
        "\1\101\1\117\1\102\2\117\1\125\1\117\1\131\1\122\1\123\1\101\1\110"+
        "\1\46\1\uffff\1\76\1\75\2\172\7\uffff\1\76\5\uffff\1\12\1\40\1\uffff"+
        "\2\124\3\172\2\124\2\114\1\122\1\123\1\111\1\114\1\131\1\172\1\107"+
        "\1\122\1\125\1\117\1\102\2\123\1\103\1\105\1\103\1\114\2\122\1\117"+
        "\1\123\1\117\1\126\1\111\1\172\1\123\1\106\1\113\1\127\1\130\1\116"+
        "\1\104\1\124\2\172\1\110\1\124\1\120\1\107\1\127\1\124\2\115\1\104"+
        "\1\115\1\123\1\102\1\125\1\113\1\120\1\111\1\122\1\105\7\uffff\1"+
        "\172\1\uffff\1\172\4\uffff\1\127\1\116\1\110\3\uffff\1\114\2\105"+
        "\1\uffff\1\172\1\125\1\114\1\131\1\124\1\172\1\40\4\172\1\115\1"+
        "\uffff\1\172\1\122\1\117\1\105\1\114\1\116\1\123\1\105\1\103\1\124"+
        "\1\101\1\122\1\114\1\123\1\124\1\123\1\172\1\115\1\114\1\111\1\125"+
        "\1\111\1\116\1\uffff\1\124\1\104\1\124\1\105\1\125\1\105\1\172\1"+
        "\113\2\172\1\125\1\105\1\117\1\uffff\1\105\1\uffff\3\105\1\125\1"+
        "\105\1\110\1\114\1\172\1\105\1\123\1\111\1\105\1\104\1\123\1\172"+
        "\1\115\1\124\1\114\1\111\1\115\1\105\1\117\1\116\1\105\1\116\1\137"+
        "\1\122\1\105\1\117\1\172\1\125\2\122\1\uffff\1\122\1\123\1\115\1"+
        "\55\6\uffff\1\115\1\uffff\1\101\1\115\1\137\1\105\1\124\1\123\2"+
        "\172\1\111\1\120\1\131\1\120\1\125\2\105\1\124\1\uffff\2\172\1\117"+
        "\1\120\1\116\2\172\1\111\2\172\1\123\1\122\1\uffff\1\105\2\uffff"+
        "\1\114\1\124\1\114\4\122\1\114\1\101\1\124\1\125\1\uffff\1\103\1"+
        "\172\1\114\1\172\1\105\1\124\1\uffff\3\105\1\114\2\172\1\116\1\117"+
        "\1\122\1\107\1\123\2\105\1\125\1\uffff\1\123\1\172\1\123\1\101\1"+
        "\172\1\117\1\uffff\1\105\1\103\1\117\1\125\1\124\1\103\2\172\2\uffff"+
        "\1\116\1\105\1\172\1\124\1\123\1\172\1\122\1\172\2\uffff\1\116\1"+
        "\172\1\107\2\uffff\1\116\2\uffff\2\172\1\122\1\105\1\123\1\117\1"+
        "\172\1\40\1\172\1\105\1\101\1\124\1\172\1\120\1\124\1\uffff\1\101"+
        "\1\uffff\1\126\1\122\1\124\1\115\1\123\1\111\2\uffff\1\172\1\127"+
        "\2\172\1\117\1\101\1\172\1\116\1\114\1\111\1\uffff\1\105\1\114\1"+
        "\uffff\1\122\2\124\1\123\1\116\1\105\1\124\2\uffff\1\103\1\172\1"+
        "\uffff\1\172\1\111\1\uffff\1\172\1\uffff\1\172\1\116\1\uffff\1\172"+
        "\1\107\2\uffff\3\172\1\107\3\uffff\1\116\1\124\1\101\1\uffff\2\172"+
        "\1\122\1\137\1\111\1\122\1\172\1\101\1\116\1\uffff\1\116\2\uffff"+
        "\1\120\1\115\1\uffff\1\172\1\114\1\126\1\103\1\172\1\120\1\122\1"+
        "\105\1\117\1\111\2\172\1\124\2\uffff\1\126\2\uffff\1\107\1\uffff"+
        "\1\172\3\uffff\1\131\1\103\1\105\1\102\2\uffff\1\172\1\123\1\116"+
        "\1\111\1\uffff\1\115\1\107\2\172\1\120\1\uffff\1\111\1\105\1\124"+
        "\1\uffff\1\110\1\111\1\122\1\115\1\124\2\uffff\1\172\1\105\1\172"+
        "\1\uffff\1\172\1\105\1\123\1\114\1\uffff\1\117\1\101\1\107\1\103"+
        "\1\120\1\172\2\uffff\4\172\1\111\1\103\1\123\1\105\1\123\1\uffff"+
        "\1\172\2\uffff\2\172\1\105\1\120\1\115\2\172\1\114\4\uffff\1\117"+
        "\1\uffff\1\103\4\172\3\uffff\2\172\1\120\2\uffff\1\105\1\116\1\172"+
        "\6\uffff\3\172\4\uffff";
    static final String DFA6_acceptS =
        "\30\uffff\1\142\4\uffff\1\152\1\153\1\154\1\155\1\156\1\157\1\160"+
        "\1\uffff\1\162\1\164\1\165\1\152\1\167\2\uffff\1\171\76\uffff\1"+
        "\166\1\141\1\143\1\146\1\144\1\147\1\145\1\uffff\1\150\1\uffff\1"+
        "\151\1\161\1\163\1\170\3\uffff\1\20\1\56\1\2\3\uffff\1\51\14\uffff"+
        "\1\12\27\uffff\1\60\15\uffff\1\77\1\uffff\1\101\41\uffff\1\3\4\uffff"+
        "\1\5\1\6\1\7\1\10\1\11\1\13\1\uffff\1\15\20\uffff\1\42\14\uffff"+
        "\1\67\1\uffff\1\71\1\72\13\uffff\1\113\6\uffff\1\123\16\uffff\1"+
        "\17\6\uffff\1\105\10\uffff\1\30\1\31\10\uffff\1\43\1\44\3\uffff"+
        "\1\57\1\61\1\uffff\1\63\1\64\17\uffff\1\115\1\uffff\1\117\6\uffff"+
        "\1\130\1\131\12\uffff\1\53\2\uffff\1\75\7\uffff\1\26\1\27\2\uffff"+
        "\1\34\2\uffff\1\37\1\uffff\1\41\2\uffff\1\46\2\uffff\1\65\1\66\4"+
        "\uffff\1\102\1\103\1\104\3\uffff\1\111\11\uffff\1\132\1\uffff\1"+
        "\134\1\135\2\uffff\1\140\15\uffff\1\33\1\35\1\uffff\1\40\1\45\1"+
        "\uffff\1\50\1\uffff\1\70\1\73\1\76\4\uffff\1\112\1\114\4\uffff\1"+
        "\125\5\uffff\1\1\3\uffff\1\74\5\uffff\1\24\1\25\3\uffff\1\62\4\uffff"+
        "\1\116\6\uffff\1\133\1\136\11\uffff\1\32\1\uffff\1\47\1\100\10\uffff"+
        "\1\127\1\137\1\16\1\52\1\uffff\1\54\5\uffff\1\36\1\106\1\107\3\uffff"+
        "\1\122\1\124\3\uffff\1\14\1\21\1\22\1\23\1\110\1\120\3\uffff\1\4"+
        "\1\121\1\126\1\55";
    static final String DFA6_specialS =
        "\u0224\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\42\10\uffff\1\54\1\53\2\uffff\1\52\22\uffff\1\54\2\uffff"+
            "\2\51\1\35\1\51\1\27\1\36\1\37\1\41\1\45\1\40\1\44\1\43\1\46"+
            "\1\34\11\33\2\uffff\1\31\1\30\1\32\2\uffff\1\5\1\1\1\6\1\7\1"+
            "\10\1\11\1\12\1\13\1\2\1\14\1\15\1\16\1\17\1\3\1\20\1\4\1\50"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\3\50\1\uffff\1\47\4\uffff\32"+
            "\50",
            "\1\55\11\uffff\1\56\11\uffff\1\57",
            "\1\61\4\uffff\1\60",
            "\1\63\15\uffff\1\62\5\uffff\1\64",
            "\1\66\15\uffff\1\65",
            "\1\67\4\uffff\1\70\4\uffff\1\71\1\uffff\1\72\4\uffff\1\73\2"+
            "\uffff\1\74",
            "\1\75\6\uffff\1\76\2\uffff\1\77\2\uffff\1\100",
            "\1\101\3\uffff\1\102",
            "\1\103\2\uffff\1\104\1\uffff\1\105",
            "\1\106\7\uffff\1\107\5\uffff\1\110\2\uffff\1\111\2\uffff\1"+
            "\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\3\uffff\1\120\3\uffff\1\121\5\uffff\1\122",
            "\1\123\7\uffff\1\124\5\uffff\1\125",
            "\1\126\12\uffff\1\127\3\uffff\1\130\1\uffff\1\131\1\132",
            "\1\133\3\uffff\1\134\5\uffff\1\135",
            "\1\136\3\uffff\1\137\5\uffff\1\140\4\uffff\1\141\1\142\3\uffff"+
            "\1\143",
            "\1\144\20\uffff\1\145",
            "\1\146\1\uffff\1\147\2\uffff\1\150",
            "\1\151",
            "\1\152",
            "\4\154",
            "",
            "\1\156\1\155",
            "\1\160",
            "\1\50\12\uffff\12\162\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\164\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\2\54\2\uffff\1\54\22\uffff\1\54",
            "",
            "\1\172\1\uffff\1\171",
            "\1\173",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\7\uffff\1\175\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50"+
            "\1\uffff\32\50",
            "\1\50\12\uffff\12\50\7\uffff\2\50\1\177\12\50\1\u0080\5\50"+
            "\1\u0081\6\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\24\uffff\1\u008c",
            "\1\50\12\uffff\12\50\7\uffff\2\50\1\u008d\25\50\1\u008e\1\50"+
            "\4\uffff\1\50\1\uffff\32\50",
            "\1\u0090",
            "\1\u0091\20\uffff\1\u0092",
            "\1\u0093\7\uffff\1\u0094\10\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\5\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\6\uffff\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a8",
            "\1\u00a9\4\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\23\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00af\5\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\50\12\uffff\12\50\7\uffff\23\50\1\u00b4\6\50\4\uffff\1\50"+
            "\1\uffff\32\50",
            "\1\50\12\uffff\12\50\7\uffff\3\50\1\u00b6\26\50\4\uffff\1\50"+
            "\1\uffff\32\50",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\1\u00bb\10\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be\12\uffff\1\u00bf",
            "\1\u00c0\7\uffff\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\12\uffff\1\u00c6",
            "\1\u00c7\5\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\7\uffff\1\u00cb\13\uffff\1\u00cc",
            "\1\u00cd\1\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\uffff\12\162\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\12\uffff\12\164\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00df",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00e4",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1\6\uffff\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0104",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134\3\uffff\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0149",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u014c",
            "\1\u014d",
            "",
            "\1\u014e",
            "",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u015c",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a\2\uffff\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0171",
            "\1\u0172",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0180",
            "\1\u0181",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0183",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "\1\u0185",
            "\1\50\12\uffff\12\50\7\uffff\10\50\1\u0186\21\50\4\uffff\1"+
            "\50\1\uffff\32\50",
            "\1\u0188",
            "",
            "",
            "\1\u0189",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0191",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01a1",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01a4",
            "\1\u01a5",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "",
            "\1\u01b3",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01b6",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01b9",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01bb",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01bf",
            "",
            "",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01db",
            "",
            "",
            "\1\u01dc",
            "",
            "",
            "\1\u01dd",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01e4\2\uffff\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "",
            "\1\u01e8",
            "\1\u01e9",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01f6",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\10\50\1\u0205\21\50\4\uffff\1"+
            "\50\1\uffff\32\50",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0214",
            "",
            "",
            "",
            "",
            "\1\u0215",
            "",
            "\1\u0216",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u021d",
            "",
            "",
            "\1\u021e",
            "\1\u021f",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\12\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BETWEEN | IS | NOT | POLYMORPHIC | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | Character_String_Literal | Equals_Operator | Not_Equals_Operator | Less_Than_Operator | Greater_Than_Operator | Less_Or_Equals_Operator | Greater_Or_Equals_Operator | Unsigned_Integer | Unsigned_Integer2 | Regular_Identifier | Left_Paren | Right_Paren | Comma | Asterisk | Concatenation_Operator | Period | Right_Arrow | Plus_Sign | Minus_Sign | Slash | Quote | Single_Quote | Basic_Latin_Without_Quotes | NEWLINE | WS );";
        }
    }
 

}