package pdl.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_AbstractCommand = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_AbstractPackageInclusion = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Date = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Package = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PackageInclusionCommand = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PackageOverrideCommand = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PassingValue = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PassingValues = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Regulation = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_RegulationInclusion = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Regulations = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AbstractCommand:
        return props_AbstractCommand;
      case LanguageConceptSwitch.AbstractPackageInclusion:
        return props_AbstractPackageInclusion;
      case LanguageConceptSwitch.Date:
        return props_Date;
      case LanguageConceptSwitch.Package:
        return props_Package;
      case LanguageConceptSwitch.PackageInclusionCommand:
        return props_PackageInclusionCommand;
      case LanguageConceptSwitch.PackageOverrideCommand:
        return props_PackageOverrideCommand;
      case LanguageConceptSwitch.PassingValue:
        return props_PassingValue;
      case LanguageConceptSwitch.PassingValues:
        return props_PassingValues;
      case LanguageConceptSwitch.Regulation:
        return props_Regulation;
      case LanguageConceptSwitch.RegulationInclusion:
        return props_RegulationInclusion;
      case LanguageConceptSwitch.Regulations:
        return props_Regulations;
    }
    return null;
  }
}
