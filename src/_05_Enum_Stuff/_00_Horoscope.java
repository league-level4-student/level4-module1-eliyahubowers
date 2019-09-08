package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void horoscopes(Zodiac e) {
		Zodiac zodiac = e;
		
		switch (zodiac) {
		
		case ARIES:{
			JOptionPane.showMessageDialog(null, "Your anger may be impossible to contain if you get into debates with family members. You need to spend less time daydreaming and more time accomplishing. You need to start planning that vacation.");
			break;
		}
		
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "You may be ill-treated if you have to deal with institutional environments. Opportunities to get ahead are evident. Curb or cut out that bad habit you've been meaning to do something about.");
			break;
		}
		
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "You can make progress if you deal with the right individuals. Your business sense will be leading you in a direction that indicates more travel and communication. Unexpected visitors will be a welcome surprise.");
			break;
		}
		
		case CANCER:{
			JOptionPane.showMessageDialog(null, " You'll be angry if those you live with aren't pulling their weight. Do something constructive outside. Look into joining groups that can give you hands-on advice about business.");
			break;
		}
		
		case LEO:{
			JOptionPane.showMessageDialog(null, "Try to include friends and relatives in your activities. You won't be able to keep a secret. Talk to your emotional partner about your intentions.");
			break;
		}
		
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Abrupt changes in your home may send you for a loop. You will be overly generous with children today. Overindulgence may be a problem.");
			break;
		}
		
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Get out and rub shoulders with people in high positions if possible. Do your own thing and everything will settle down. You will have original ideas for ways to make extra money.");
			break;
		}
		
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Catch up on any correspondence you've neglected. Secret activity is evident. Social gatherings will be conducive to meeting new potential mates.");
			break;
		}
		
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Things will be emotional with your spouse. You should make sure that your personal papers are in order. Refrain from arguing with your spouse.");
			break;
		}
		
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You should try to elaborate on an idea you have regarding a product or service for the home. Courses dealing with psychology or health care will be of interest. Don't lend to people who have given you negative vibes.");
			break;
		}
		
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Control your emotions and everything will fall into place. Someone may be trying to pull the wool over your eyes. Be aware of deception when it comes to your position, and be sure not to jump to conclusions.");
			break;
		}
		
		case PISCES:{
			JOptionPane.showMessageDialog(null, " You'll have great insight. You have done all you can to sort things out a personal level. Don't play on your partner's emotions.");
			break;
		}
		
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscopes(Zodiac.AQUARIUS);
	}
}
