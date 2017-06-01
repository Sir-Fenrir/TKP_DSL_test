package pdl.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAbstractCommand = createDescriptorForAbstractCommand();
  /*package*/ final ConceptDescriptor myConceptAbstractPackageInclusion = createDescriptorForAbstractPackageInclusion();
  /*package*/ final ConceptDescriptor myConceptBRR_Afg_Inst = createDescriptorForBRR_Afg_Inst();
  /*package*/ final ConceptDescriptor myConceptBRR_Afgeleid = createDescriptorForBRR_Afgeleid();
  /*package*/ final ConceptDescriptor myConceptBRR_Instabiel = createDescriptorForBRR_Instabiel();
  /*package*/ final ConceptDescriptor myConceptBasisrekenregel = createDescriptorForBasisrekenregel();
  /*package*/ final ConceptDescriptor myConceptBibliotheek = createDescriptorForBibliotheek();
  /*package*/ final ConceptDescriptor myConceptDate = createDescriptorForDate();
  /*package*/ final ConceptDescriptor myConceptENExpressie = createDescriptorForENExpressie();
  /*package*/ final ConceptDescriptor myConceptOverrideProductInclusion = createDescriptorForOverrideProductInclusion();
  /*package*/ final ConceptDescriptor myConceptPackage = createDescriptorForPackage();
  /*package*/ final ConceptDescriptor myConceptPackageInclusionCommand = createDescriptorForPackageInclusionCommand();
  /*package*/ final ConceptDescriptor myConceptPackageOverrideCommand = createDescriptorForPackageOverrideCommand();
  /*package*/ final ConceptDescriptor myConceptPassingValue = createDescriptorForPassingValue();
  /*package*/ final ConceptDescriptor myConceptPassingValues = createDescriptorForPassingValues();
  /*package*/ final ConceptDescriptor myConceptProduct = createDescriptorForProduct();
  /*package*/ final ConceptDescriptor myConceptProductInclusion = createDescriptorForProductInclusion();
  /*package*/ final ConceptDescriptor myConceptRegulation = createDescriptorForRegulation();
  /*package*/ final ConceptDescriptor myConceptRegulationInclusion = createDescriptorForRegulationInclusion();
  /*package*/ final ConceptDescriptor myConceptRegulations = createDescriptorForRegulations();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAbstractCommand, myConceptAbstractPackageInclusion, myConceptBRR_Afg_Inst, myConceptBRR_Afgeleid, myConceptBRR_Instabiel, myConceptBasisrekenregel, myConceptBibliotheek, myConceptDate, myConceptENExpressie, myConceptOverrideProductInclusion, myConceptPackage, myConceptPackageInclusionCommand, myConceptPackageOverrideCommand, myConceptPassingValue, myConceptPassingValues, myConceptProduct, myConceptProductInclusion, myConceptRegulation, myConceptRegulationInclusion, myConceptRegulations);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.AbstractCommand:
        return myConceptAbstractCommand;
      case LanguageConceptSwitch.AbstractPackageInclusion:
        return myConceptAbstractPackageInclusion;
      case LanguageConceptSwitch.BRR_Afg_Inst:
        return myConceptBRR_Afg_Inst;
      case LanguageConceptSwitch.BRR_Afgeleid:
        return myConceptBRR_Afgeleid;
      case LanguageConceptSwitch.BRR_Instabiel:
        return myConceptBRR_Instabiel;
      case LanguageConceptSwitch.Basisrekenregel:
        return myConceptBasisrekenregel;
      case LanguageConceptSwitch.Bibliotheek:
        return myConceptBibliotheek;
      case LanguageConceptSwitch.Date:
        return myConceptDate;
      case LanguageConceptSwitch.ENExpressie:
        return myConceptENExpressie;
      case LanguageConceptSwitch.OverrideProductInclusion:
        return myConceptOverrideProductInclusion;
      case LanguageConceptSwitch.Package:
        return myConceptPackage;
      case LanguageConceptSwitch.PackageInclusionCommand:
        return myConceptPackageInclusionCommand;
      case LanguageConceptSwitch.PackageOverrideCommand:
        return myConceptPackageOverrideCommand;
      case LanguageConceptSwitch.PassingValue:
        return myConceptPassingValue;
      case LanguageConceptSwitch.PassingValues:
        return myConceptPassingValues;
      case LanguageConceptSwitch.Product:
        return myConceptProduct;
      case LanguageConceptSwitch.ProductInclusion:
        return myConceptProductInclusion;
      case LanguageConceptSwitch.Regulation:
        return myConceptRegulation;
      case LanguageConceptSwitch.RegulationInclusion:
        return myConceptRegulationInclusion;
      case LanguageConceptSwitch.Regulations:
        return myConceptRegulations;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAbstractCommand() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "AbstractCommand", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x2d523c5e4cc4574aL);
    b.class_(false, true, false);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/3265739055509559114");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAbstractPackageInclusion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "AbstractPackageInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3bb5f98642d94102L);
    b.class_(false, true, false);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/4302619374064845058");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBRR_Afg_Inst() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "BRR_Afg_Inst", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b37aL);
    b.class_(false, false, false);
    b.super_("pdl.structure.Basisrekenregel", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b371L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/2928111019390251898");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBRR_Afgeleid() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "BRR_Afgeleid", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b378L);
    b.class_(false, false, false);
    b.super_("pdl.structure.Basisrekenregel", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b371L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/2928111019390251896");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBRR_Instabiel() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "BRR_Instabiel", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b379L);
    b.class_(false, false, false);
    b.super_("pdl.structure.Basisrekenregel", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b371L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/2928111019390251897");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBasisrekenregel() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Basisrekenregel", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b371L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/2928111019390251889");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBibliotheek() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Bibliotheek", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b363L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/2928111019390251875");
    b.aggregate("brr", 0x28a2bd7555a9b37bL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a9b371L).optional(false).ordered(true).multiple(true).origin("2928111019390251899").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDate() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Date", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91ddfb7L);
    b.class_(false, false, false);
    b.super_("pdl.structure.AbstractCommand", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x2d523c5e4cc4574aL);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/5183686124150579127");
    b.prop("day", 0x47f02710c91ddfd3L, "5183686124150579155");
    b.prop("month", 0x47f02710c91ddfd6L, "5183686124150579158");
    b.prop("year", 0x47f02710c91ddfdbL, "5183686124150579163");
    b.alias("[");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForENExpressie() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "ENExpressie", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x28a2bd7555a85e72L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.baseLanguage.structure.AndExpression", 0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb7c3070eeL);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/2928111019390164594");
    b.alias("EN");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOverrideProductInclusion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "OverrideProductInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x1ad8539c4a8af5d0L);
    b.class_(false, false, false);
    b.super_("pdl.structure.ProductInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x1ad8539c4a89c185L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/1934387970686252496");
    b.alias("override");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPackage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Package", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3c1705fde7c43cf9L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/4329936154813283577");
    b.associate("extends", 0x1ad8539c4a89c18cL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3c1705fde7c43cf9L).optional(true).origin("1934387970686173580").done();
    b.aggregate("test", 0x28a2bd7555a73871L).target(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L).optional(false).ordered(true).multiple(false).origin("2928111019390089329").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPackageInclusionCommand() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "PackageInclusionCommand", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3bb5f98642d940deL);
    b.class_(false, false, false);
    b.super_("pdl.structure.AbstractPackageInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3bb5f98642d94102L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/4302619374064845022");
    b.associate("PassingValueToAssign", 0x7a6e02eafebb0fdeL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x672a35c484820425L).optional(false).origin("8821991928384655326").done();
    b.associate("packageToInclude", 0x3c1705fde7c43cf6L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3c1705fde7c43cf9L).optional(false).origin("4329936154813283574").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPackageOverrideCommand() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "PackageOverrideCommand", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3bb5f98642d94121L);
    b.class_(false, false, false);
    b.super_("pdl.structure.AbstractPackageInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3bb5f98642d94102L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/4302619374064845089");
    b.associate("assignmentToOverride", 0x3bb5f98642d94140L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x672a35c484820425L).optional(false).origin("4302619374064845120").done();
    b.associate("packageToUse", 0x3bb5f98642d9414aL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3c1705fde7c43cf9L).optional(false).origin("4302619374064845130").done();
    b.alias("override");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPassingValue() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "PassingValue", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x672a35c484820425L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/7433813253081400357");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPassingValues() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "PassingValues", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x672a35c484820409L);
    b.class_(false, false, true);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/7433813253081400329");
    b.aggregate("listofPassingValues", 0x672a35c484820457L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x672a35c484820425L).optional(true).ordered(true).multiple(true).origin("7433813253081400407").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProduct() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Product", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x1ad8539c4a89c149L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/1934387970686173513");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProductInclusion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "ProductInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x1ad8539c4a89c185L);
    b.class_(false, false, false);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/1934387970686173573");
    b.associate("PassingValueToAssign", 0x1ad8539c4a8af57dL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x672a35c484820425L).optional(false).origin("1934387970686252413").done();
    b.associate("ProductToInclude", 0x1ad8539c4a8af57fL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x1ad8539c4a89c149L).optional(true).origin("1934387970686252415").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRegulation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Regulation", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91d56f4L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/5183686124150544116");
    b.associate("extends", 0x47f02710c91f4e00L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91d56f4L).optional(true).origin("5183686124150672896").done();
    b.aggregate("packageList", 0x3c1705fde7c2f696L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x3bb5f98642d94102L).optional(true).ordered(true).multiple(true).origin("4329936154813200022").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRegulationInclusion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "RegulationInclusion", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91ddf98L);
    b.class_(false, false, false);
    b.super_("pdl.structure.AbstractCommand", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x2d523c5e4cc4574aL);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/5183686124150579096");
    b.associate("definition", 0x47f02710c91ddfb4L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91d56f4L).optional(false).origin("5183686124150579124").done();
    b.aggregate("startDate", 0x47f02710c91ec5f3L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91ddfb7L).optional(false).ordered(true).multiple(false).origin("5183686124150638067").done();
    b.aggregate("endDate", 0x47f02710c91ec5f6L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91ddfb7L).optional(false).ordered(true).multiple(false).origin("5183686124150638070").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRegulations() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Regulations", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91d56a1L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/5183686124150544033");
    b.aggregate("includedRegulations", 0x47f02710c91e5c5eL).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x2d523c5e4cc4574aL).optional(false).ordered(true).multiple(true).origin("5183686124150611038").done();
    return b.create();
  }
}
