package dk.bayes.model.factor

/**
 * This factor represents a truncated Gaussian distribution.
 *
 * @author Daniel Korzekwa
 *
 * @param gaussianVarId
 * @param truncVarId
 * @param truncValue The value, at which Gaussian distribution is truncated at.
 */
case class TruncGaussianFactor(gaussianVarId: Int, truncVarId: Int, truncValue: Double) extends Factor {

  def getVariableIds(): Seq[Int] = throw new UnsupportedOperationException("Not implemented yet")

  def marginal(varId: Int): Factor = throw new UnsupportedOperationException("Not implemented yet")

  def withEvidence(varId: Int, varValue: AnyVal): TableFactor = throw new UnsupportedOperationException("Not implemented yet")

  def getValue(assignment: (Int, AnyVal)*): Double = throw new UnsupportedOperationException("Not implemented yet")

  def *(factor: Factor): Factor = throw new UnsupportedOperationException("Not implemented yet")
}