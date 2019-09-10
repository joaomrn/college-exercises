package refactor;

import javax.swing.*;

/**
 * Class of a store motorcycle
 */
public class MotorcycleStore {
	
	/**
	 * Class of a store motorcycle
	 * 
	 * @return void
	 */
	public static void main(String[] args) 
	{
		// Repetition
		while (true){
			
			// Try verification 
			try {
				// Input message
				String model = JOptionPane.showInputDialog("Please, type the brand or press [Cancel] to cancel ");
				
				// Factory of motorcycles
				factory(model);
			} catch (Exception e) {
				break;
			}	
		}
		// Message to show the software finalization
		System.out.println("\nSOFTWARE FINALIZED.\n");
	}

	/**
	 * Factory of motorcycles
	 * 
	 * @return void
	 */
	private static void factory(String model) 
	{
		if (model.equalsIgnoreCase("Honda")) {
			Motorcycle motorcycle = new Honda();
			showMotorcycleData(motorcycle);
		}
		else if (model.equalsIgnoreCase("Yamaha")) {
			Motorcycle motorcycle = new Yamaha();
			showMotorcycleData(motorcycle);
		}			
		else if (model.equalsIgnoreCase("Suzuki")) {
			Motorcycle motorcycle = new Suzuki();
			showMotorcycleData(motorcycle);
		}
		else {
			showValidationMessage();
		}
	}

	private static void showValidationMessage() {
		JOptionPane.showMessageDialog(null, "Only available on motorcycle store: Honda, Yamaha or Suzuki.", "Software message", JOptionPane.CLOSED_OPTION);
	}

	/**
	 * Class of a store motorcycle
	 * 
	 * @return void
	 */	
	private static void showMotorcycleData(Motorcycle motorcycle) 
	{
		JOptionPane.showMessageDialog(null, "\nModel: " + motorcycle.model + "\nDisplacement: " + motorcycle.displacement + "\nColor: " + motorcycle.color, "Motorcycle data", JOptionPane.CLOSED_OPTION);
	}
}