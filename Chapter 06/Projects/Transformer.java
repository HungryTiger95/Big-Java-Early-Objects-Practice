
/**
 * P6.16
 * 
 * The photo at the left shows an electric device called a "transformer". Transformers are
 * often constructed by wrapping coils of wire around a ferrite core. The figure below
 * illustrates a situation that occurs in various audio devices such as cell phones and
 * music players. In this circuit, a transformer is used to connect a speaker to the output
 * of an audio amplifier.
 * 
 * The symbol used to represent the transformer is intended to suggest two coils of
 * wire. The parameter n of the transformer is called the "turns ratio" of the transformer.
 * (The number of times that a wire is wrapped around the core to forma coil is
 * called the number of turns in the coil. The turns ratio is literally the raio
 * of the number of turn in the two coils of wire.)
 * 
 * When designing the circuit, we are concerned primarily with the value of the power
 * delivered to the speaker - that power causes the speaker to produce the sounds we
 * want to hear. Suppose we were to connect the speakers directly to the amplifier
 * without using the transformer. Some fraction of the power available from the
 * amplifier would get to the speakers. The rest of the available power would be lost in
 * the amplifier itself. The transformer is added to the circuit to increase the fraction of
 * of the amplifier power that is delivered to the speakers.
 * 
 * The power, P5, delivered to the speakers is calculated using the formula
 * 
 * 			P5 = R5 * ((n * V5) / ((n^2 * R0) + R5))^2
 * 
 * Write a program that models the circuit shown and varies the turns ratio from 0.01 to
 * 2 in 0.01 increments, then determines the value of the turns raio that maximizes the
 * power delivered to the speakers.
 * 
 * @author Mayuresh
 *
 */
public class Transformer {

}
