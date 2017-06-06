<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:1a25c2cc-7d4b-429e-8f48-d942f8baad51(Sandbox.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="b4f0e2b8-f6a2-4a0a-9dec-e769e700ea8c" name="pdl" version="0" />
  </languages>
  <imports>
    <import index="xyyp" ref="r:1a25c2cc-7d4b-429e-8f48-d942f8baad51(Sandbox.sandbox)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242869" name="jetbrains.mps.baseLanguage.structure.MinusExpression" flags="nn" index="3cpWsd" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
    </language>
    <language id="b4f0e2b8-f6a2-4a0a-9dec-e769e700ea8c" name="pdl">
      <concept id="7881559332714976166" name="pdl.structure.ProductInclusie" flags="ng" index="3LfZi">
        <reference id="7881559332714976197" name="product" index="3LfYL" />
      </concept>
      <concept id="5183686124150544033" name="pdl.structure.Fonds" flags="ng" index="2eVn6L">
        <child id="5183686124150611038" name="includedRegulations" index="2eVBHe" />
      </concept>
      <concept id="5183686124150544116" name="pdl.structure.Reglement" flags="ng" index="2eVn7$">
        <reference id="5183686124150672896" name="basis" index="2eVQ$g" />
        <child id="4329936154813200022" name="productpakketten" index="3rPvdF" />
      </concept>
      <concept id="5183686124150579096" name="pdl.structure.ReglementInclusie" flags="ng" index="2eVvy8">
        <reference id="5183686124150579124" name="definitie" index="2eVvy$" />
        <child id="5183686124150638067" name="ingangsDatum" index="2eVIbz" />
      </concept>
      <concept id="5183686124150579127" name="pdl.structure.Datum" flags="ng" index="2eVvyB">
        <property id="5183686124150579155" name="dag" index="2eVvz3" />
        <property id="5183686124150579158" name="maand" index="2eVvz6" />
        <property id="5183686124150579163" name="jaar" index="2eVvzb" />
      </concept>
      <concept id="511620353581196582" name="pdl.structure.KenmerkCreatie" flags="ng" index="W284A">
        <child id="511620353581208123" name="mutaties" index="W2foV" />
      </concept>
      <concept id="511620353581196592" name="pdl.structure.KenmerkToewijzing" flags="ng" index="W284K">
        <child id="511620353581196602" name="ingangDatum" index="W284U" />
      </concept>
      <concept id="511620353581369653" name="pdl.structure.IntegerKenmerk" flags="ig" index="W2AOP" />
      <concept id="511620353581369683" name="pdl.structure.DatumType" flags="ig" index="W2APj" />
      <concept id="511620353581315759" name="pdl.structure.IntToewijzing" flags="ng" index="W2PaJ">
        <child id="511620353581315772" name="waarde" index="W2PaW" />
      </concept>
      <concept id="511620353580901100" name="pdl.structure.Invoer" flags="ng" index="W5grG">
        <child id="511620353580907351" name="invoerStatements" index="W5hXn" />
      </concept>
      <concept id="511620353580901156" name="pdl.structure.LeesDB" flags="ng" index="W5gs$">
        <child id="511620353580902585" name="parameter" index="W5gMT" />
      </concept>
      <concept id="511620353580907278" name="pdl.structure.InvoerStatement" flags="ng" index="W5hWe">
        <child id="511620353580907288" name="type" index="W5hWo" />
        <child id="511620353580907290" name="invulling" index="W5hWq" />
      </concept>
      <concept id="511620353579953525" name="pdl.structure.VervangProduct" flags="ng" index="XTS_P">
        <reference id="511620353579953526" name="vervang" index="XTS_Q" />
      </concept>
      <concept id="511620353579953564" name="pdl.structure.VervangProductStatement" flags="ng" index="XTSAs">
        <reference id="511620353580148786" name="nieuwProduct" index="W68KM" />
        <child id="511620353579953567" name="teVervangen" index="XTSAv" />
      </concept>
      <concept id="8384499377550104498" name="pdl.structure.Productelement" flags="ng" index="2Y02TK">
        <child id="8384499377550104499" name="statements" index="2Y02TL" />
      </concept>
      <concept id="8384499377550277314" name="pdl.structure.ProductPakketInclusie" flags="ng" index="2Y1oc0">
        <child id="1688978051348504657" name="expressie" index="37vPj7" />
      </concept>
      <concept id="8384499377549786365" name="pdl.structure.ProductpakketRef" flags="ng" index="2Y3gkZ">
        <reference id="8384499377549786366" name="productpakket" index="2Y3gkW" />
      </concept>
      <concept id="8384499377550970019" name="pdl.structure.InclusieRef" flags="ng" index="2YcRlx">
        <reference id="8384499377550970020" name="inclusie" index="2YcRlA" />
      </concept>
      <concept id="1688978051349051313" name="pdl.structure.VervangProductPakketStatement" flags="ng" index="37pKcB">
        <child id="1688978051349051344" name="nieuweExpressie" index="37pKd6" />
        <child id="1688978051349051341" name="teVervangen" index="37pKdr" />
      </concept>
      <concept id="1688978051349051208" name="pdl.structure.VervangProductPakket" flags="ng" index="37pKfu">
        <reference id="1688978051349051236" name="vervang" index="37pKfM" />
      </concept>
      <concept id="1934387970686173513" name="pdl.structure.Product" flags="ng" index="1gkpbl" />
      <concept id="4329936154813283577" name="pdl.structure.Productpakket" flags="ng" index="3rON$4">
        <reference id="1934387970686173580" name="basis" index="1gkp8g" />
        <child id="7881559332714983623" name="producten" index="3LdMN" />
      </concept>
      <concept id="2928111019390251889" name="pdl.structure.Basisrekenregel" flags="ng" index="1X2KS4">
        <property id="2928111019390781880" name="commentaar" index="1X4Rjd" />
      </concept>
      <concept id="2928111019390251875" name="pdl.structure.Bibliotheek" flags="ng" index="1X2KSm">
        <child id="2928111019390251899" name="brr" index="1X2KSe" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2eVn6L" id="4vK9L397_2t">
    <property role="TrG5h" value="test_fund" />
    <node concept="2eVvy8" id="1tKt9rg4oAr" role="2eVBHe">
      <ref role="2eVvy$" node="4vK9L397Gij" resolve="firstPeriod" />
      <node concept="2eVvyB" id="1tKt9rg4oAs" role="2eVIbz">
        <property role="2eVvz3" value="01" />
        <property role="2eVvz6" value="01" />
        <property role="2eVvzb" value="2000" />
      </node>
    </node>
  </node>
  <node concept="2eVn7$" id="4vK9L397Gij">
    <property role="TrG5h" value="firstPeriod" />
    <node concept="2Y1oc0" id="1tKt9rg4nHy" role="3rPvdF">
      <property role="TrG5h" value="lop" />
      <node concept="3cpWs3" id="1tKt9rg4nYg" role="37vPj7">
        <node concept="3cmrfG" id="1tKt9rg4nYz" role="3uHU7w">
          <property role="3cmrfH" value="1" />
        </node>
        <node concept="2Y3gkZ" id="1tKt9rg4nHI" role="3uHU7B">
          <ref role="2Y3gkW" node="3Kn1vRBL5V6" resolve="Middelloon" />
        </node>
      </node>
    </node>
    <node concept="2Y1oc0" id="1tKt9rg4oga" role="3rPvdF">
      <property role="TrG5h" value="bbp" />
      <node concept="3cpWs3" id="1tKt9rg4ox3" role="37vPj7">
        <node concept="2Y3gkZ" id="1tKt9rg4ogx" role="3uHU7B">
          <ref role="2Y3gkW" node="3Kn1vRBL5V6" resolve="Middelloon" />
        </node>
        <node concept="2YcRlx" id="1tKt9rg5Par" role="3uHU7w">
          <ref role="2YcRlA" node="1tKt9rg4nHy" resolve="lop" />
        </node>
      </node>
    </node>
  </node>
  <node concept="2eVn7$" id="3IPYop2QiB0">
    <property role="TrG5h" value="secondPeriod" />
    <ref role="2eVQ$g" node="4vK9L397Gij" resolve="firstPeriod" />
    <node concept="37pKcB" id="6PwV7hIBQvK" role="3rPvdF">
      <node concept="37pKfu" id="6PwV7hIBQvL" role="37pKdr">
        <ref role="37pKfM" node="1tKt9rg4nHy" resolve="lop" />
      </node>
      <node concept="3cpWsd" id="6PwV7hIBQKB" role="37pKd6">
        <node concept="2YcRlx" id="6PwV7hIBQKU" role="3uHU7w">
          <ref role="2YcRlA" node="1tKt9rg4oga" resolve="bbp" />
        </node>
        <node concept="2YcRlx" id="6PwV7hIBQw5" role="3uHU7B">
          <ref role="2YcRlA" node="1tKt9rg4nHy" resolve="lop" />
        </node>
      </node>
    </node>
    <node concept="2Y1oc0" id="6PwV7hIBQO7" role="3rPvdF">
      <property role="TrG5h" value="hello" />
      <node concept="3cpWs3" id="6PwV7hIDElM" role="37vPj7">
        <node concept="3cmrfG" id="6PwV7hIDEt8" role="3uHU7w">
          <property role="3cmrfH" value="1" />
        </node>
        <node concept="3cpWs3" id="6PwV7hICc5Q" role="3uHU7B">
          <node concept="2Y3gkZ" id="6PwV7hIBQOv" role="3uHU7B">
            <ref role="2Y3gkW" node="3Kn1vRBL5V6" resolve="Middelloon" />
          </node>
          <node concept="2YcRlx" id="6PwV7hIDDYE" role="3uHU7w">
            <ref role="2YcRlA" node="1tKt9rg4oga" resolve="bbp" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2Y1oc0" id="6PwV7hIBQOU" role="3rPvdF">
      <property role="TrG5h" value="test" />
      <node concept="3cpWs3" id="6PwV7hIBR5S" role="37vPj7">
        <node concept="3cmrfG" id="6PwV7hIBR6b" role="3uHU7w">
          <property role="3cmrfH" value="1" />
        </node>
        <node concept="2YcRlx" id="6PwV7hIBQPm" role="3uHU7B">
          <ref role="2YcRlA" node="6PwV7hIBQO7" resolve="hello" />
        </node>
      </node>
    </node>
    <node concept="37pKcB" id="6PwV7hIDENh" role="3rPvdF">
      <node concept="37pKfu" id="6PwV7hIDENj" role="37pKdr">
        <ref role="37pKfM" node="1tKt9rg4oga" resolve="bbp" />
      </node>
      <node concept="2YcRlx" id="6PwV7hIDEO7" role="37pKd6">
        <ref role="2YcRlA" node="6PwV7hIBQO7" resolve="hello" />
      </node>
    </node>
  </node>
  <node concept="3rON$4" id="3Kn1vRBL5V6">
    <property role="TrG5h" value="Middelloon" />
    <node concept="3LfZi" id="spD00UZyPI" role="3LdMN">
      <property role="TrG5h" value="actief" />
      <ref role="3LfYL" node="1FokTLayVL2" resolve="Active" />
    </node>
    <node concept="3LfZi" id="spD00UZUCj" role="3LdMN">
      <property role="TrG5h" value="slapend" />
      <ref role="3LfYL" node="spD00UZUBM" resolve="Slapend" />
    </node>
  </node>
  <node concept="1gkpbl" id="1FokTLayVL2">
    <property role="TrG5h" value="Active" />
  </node>
  <node concept="1X2KSm" id="2yyJnllEyuR">
    <property role="TrG5h" value="Bieb" />
    <node concept="1X2KS4" id="2yyJnllFWXZ" role="1X2KSe">
      <property role="TrG5h" value="meo" />
      <property role="1X4Rjd" value="Dit doet iets." />
      <node concept="10Oyi0" id="2yyJnllFWY8" role="3clF45" />
      <node concept="3clFbS" id="2yyJnllFWY1" role="3clF47">
        <node concept="3cpWs8" id="2yyJnllFX03" role="3cqZAp">
          <node concept="3cpWsn" id="2yyJnllFX06" role="3cpWs9">
            <property role="TrG5h" value="test2" />
            <node concept="10Oyi0" id="2yyJnllFX02" role="1tU5fm" />
            <node concept="3cpWs3" id="2yyJnllFXhs" role="33vP2m">
              <node concept="3cmrfG" id="2yyJnllFXhM" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="37vLTw" id="2yyJnllFX0w" role="3uHU7B">
                <ref role="3cqZAo" node="2yyJnllFWZF" resolve="test" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="2yyJnllFXuR" role="3cqZAp">
          <node concept="3cpWs3" id="2yyJnllGlQv" role="3cqZAk">
            <node concept="37vLTw" id="2yyJnllGlQO" role="3uHU7w">
              <ref role="3cqZAo" node="2yyJnllG3lI" resolve="test3" />
            </node>
            <node concept="37vLTw" id="2yyJnllFXvh" role="3uHU7B">
              <ref role="3cqZAo" node="2yyJnllFX06" resolve="test2" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2yyJnllFWZF" role="3clF46">
        <property role="TrG5h" value="test" />
        <node concept="10Oyi0" id="2yyJnllFWZE" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="2yyJnllG3lI" role="3clF46">
        <property role="TrG5h" value="test3" />
        <node concept="10Oyi0" id="2yyJnllG3m2" role="1tU5fm" />
      </node>
    </node>
  </node>
  <node concept="2Y02TK" id="7hrIsbans3p">
    <property role="TrG5h" value="blabla" />
    <node concept="3clFbS" id="7hrIsbans3q" role="2Y02TL">
      <node concept="3cpWs6" id="7hrIsbans3r" role="3cqZAp">
        <node concept="3cpWs3" id="7hrIsbans_l" role="3cqZAk">
          <node concept="3cmrfG" id="7hrIsbans_s" role="3uHU7w">
            <property role="3cmrfH" value="1" />
          </node>
          <node concept="3cmrfG" id="7hrIsbans3z" role="3uHU7B">
            <property role="3cmrfH" value="1" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2eVn7$" id="1tKt9rg5c5I">
    <property role="TrG5h" value="thirdPeriod" />
    <ref role="2eVQ$g" node="3IPYop2QiB0" resolve="secondPeriod" />
    <node concept="2Y1oc0" id="6PwV7hICODY" role="3rPvdF">
      <property role="TrG5h" value="maw" />
      <node concept="3cmrfG" id="6PwV7hICOEl" role="37vPj7">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
  </node>
  <node concept="1gkpbl" id="spD00UZUBM">
    <property role="TrG5h" value="Slapend" />
  </node>
  <node concept="1gkpbl" id="spD00UZUBW">
    <property role="TrG5h" value="Actief_2" />
  </node>
  <node concept="1gkpbl" id="spD00UZUC6">
    <property role="TrG5h" value="Slapend_2" />
  </node>
  <node concept="3rON$4" id="spD00UZUCn">
    <property role="TrG5h" value="Middelloon_2" />
    <ref role="1gkp8g" node="3Kn1vRBL5V6" resolve="Middelloon" />
    <node concept="3LfZi" id="spD00V0i63" role="3LdMN">
      <property role="TrG5h" value="test" />
      <ref role="3LfYL" node="spD00UZUBM" resolve="Slapend" />
    </node>
    <node concept="XTSAs" id="spD00V06lQ" role="3LdMN">
      <ref role="W68KM" node="spD00UZUC6" resolve="Slapend_2" />
      <node concept="XTS_P" id="spD00V06lR" role="XTSAv">
        <ref role="XTS_Q" node="spD00UZUCj" resolve="slapend" />
      </node>
    </node>
  </node>
  <node concept="W5grG" id="spD00V3o2P">
    <node concept="W5hWe" id="spD00V3o2Q" role="W5hXn">
      <property role="TrG5h" value="bla" />
      <node concept="10Oyi0" id="spD00V3o32" role="W5hWo" />
      <node concept="W5gs$" id="spD00V3$AO" role="W5hWq">
        <node concept="Xl_RD" id="spD00V3$AQ" role="W5gMT">
          <property role="Xl_RC" value="parameter" />
        </node>
      </node>
    </node>
    <node concept="W5hWe" id="spD00V5upt" role="W5hXn">
      <property role="TrG5h" value="test" />
      <node concept="W2AOP" id="spD00V5upB" role="W5hWo" />
      <node concept="W284A" id="spD00V6knJ" role="W5hWq">
        <node concept="W2PaJ" id="spD00V7kuk" role="W2foV">
          <node concept="3cmrfG" id="spD00V7kul" role="W2PaW">
            <property role="3cmrfH" value="53" />
          </node>
          <node concept="2eVvyB" id="spD00V7kum" role="W284U">
            <property role="2eVvz3" value="1" />
            <property role="2eVvz6" value="1" />
            <property role="2eVvzb" value="2000" />
          </node>
        </node>
      </node>
    </node>
    <node concept="W5hWe" id="spD00V7NEQ" role="W5hXn">
      <property role="TrG5h" value="datum" />
      <node concept="W2APj" id="spD00V7NF6" role="W5hWo" />
      <node concept="3cmrfG" id="spD00V8lxa" role="W5hWq">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
  </node>
</model>

