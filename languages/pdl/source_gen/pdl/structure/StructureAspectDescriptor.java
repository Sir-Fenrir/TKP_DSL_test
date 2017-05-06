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
  /*package*/ final ConceptDescriptor myConceptDate = createDescriptorForDate();
  /*package*/ final ConceptDescriptor myConceptRegulation = createDescriptorForRegulation();
  /*package*/ final ConceptDescriptor myConceptRegulationInclusion = createDescriptorForRegulationInclusion();
  /*package*/ final ConceptDescriptor myConceptRegulations = createDescriptorForRegulations();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAbstractCommand, myConceptDate, myConceptRegulation, myConceptRegulationInclusion, myConceptRegulations);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.AbstractCommand:
        return myConceptAbstractCommand;
      case LanguageConceptSwitch.Date:
        return myConceptDate;
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
  private static ConceptDescriptor createDescriptorForRegulation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("pdl", "Regulation", 0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91d56f4L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:1ee7c477-671c-4c79-ab43-202dcf795b45(pdl.structure)/5183686124150544116");
    b.associate("extends", 0x47f02710c91f4e00L).target(0xb4f0e2b8f6a24a0aL, 0x9dece769e700ea8cL, 0x47f02710c91d56f4L).optional(true).origin("5183686124150672896").done();
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
