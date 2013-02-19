1D robot localisation
====================

The task is to predict the location of a robot given noisy observations of its current position [1](#references). In a static localisation setup (Figure 1b), 
it's assumed that robot is not moving while subsequent measurements of a robot location are taken. Whereas in a dynamic variant (Figure 1a), 
robot's position is changing over the time.

![Localisation 1D](https://raw.github.com/danielkorzekwa/bayes-scala/master/doc/localisation_example/localisation_1d.png "Localisation 1D")

Figure 1 Graphical model for dynamic (a) and static (b) robot location.

Robot location at the time t0:

![Prior prob](https://raw.github.com/danielkorzekwa/bayes-scala/master/doc/localisation_example/prior_prob.png "Prior prob")

Robot location at the time t1 given its location at the time t0:

![Transition prob](https://raw.github.com/danielkorzekwa/bayes-scala/master/doc/localisation_example/transition_prob.png "Transition prob")

Measured robot position given its current location:

![Emission prob](https://raw.github.com/danielkorzekwa/bayes-scala/master/doc/localisation_example/emission_prob.png "Emission prob")

Predicted robot location given observed position:

![Posterior](https://raw.github.com/danielkorzekwa/bayes-scala/master/doc/localisation_example/posterior.png "Posterior")

There are 4 different solutions to this problem presented below, 
including Kalman Filter, Canonical Gaussian, Bayes's theorem for Gaussian Variables and Expectation Propagation.

* Kalman Filter [1](#references)
  * [Static localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/StaticLocalisationKalmanTest.scala)
  * [Dynamic localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/HMMLocalisationKalmanTest.scala)
* Canonical Gaussian [2,4](#references)
  * [Static localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/StaticLocalisationCanonicalGaussianTest.scala)
  * [Dynamic localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/HMMLocalisationCanonicalGaussianTest.scala)
* Bayes's theorem for Gaussian Variables [3](#references)
  * [Static localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/StaticLocalisationGaussianTest.scala)
  * [Dynamic localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/HMMLocalisationGaussianTest.scala)
* Expectation Propagation [3,5](#references)
  * [Static localisation](https://github.com/danielkorzekwa/bayes-scala/blob/master/src/test/scala/dk/bayes/gaussian/localisation1d/StaticLocalisationEPTest.scala)
 
References
---------------
1. Stuart Russell, Peter Norvig. Artificial Intelligence - A Modern Approach, Third Edition, Chapter 15.4.2 A simple one-dimensional example, 2010
2. Daphne Koller, Nir Friedman. Probabilistic Graphical Models, Principles and Techniques, 2009
3. Christopher M. Bishop. Pattern Recognition and Machine Learning (Information Science and Statistics), 2009
4. Kevin P. Murphy. A Variational Approximation for Bayesian Networks with Discrete and Continuous Latent Variables, 1999
5. Thomas P Minka. Expectation Propagation for Approximate Bayesian Inference, 2004