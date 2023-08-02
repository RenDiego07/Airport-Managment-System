package Builder;
import java.util.ArrayList;

import com.company.Model.Airplane;
import com.company.Model.Passanger;
import com.company.Model.Ticket;
public class ComercialFlight {
	   private String id;
	    private Airplane airplane;
	    private Ticket ticket;
	    private String origin;
	    private String desination;
	    private String date;
	    private String duration;
	    private String nmbrOFsoldTickets;
	    private ArrayList<Passanger> passangers;
	    private String takeOffTime;
	    private String flightPrice;
	    private String flightFine;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Airplane getAirplane() {
			return airplane;
		}
		public void setAirplane(Airplane airplane) {
			this.airplane = airplane;
		}
		public Ticket getTicket() {
			return ticket;
		}
		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getDesination() {
			return desination;
		}
		public void setDesination(String desination) {
			this.desination = desination;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getNmbrOFsoldTickets() {
			return nmbrOFsoldTickets;
		}
		public void setNmbrOFsoldTickets(String nmbrOFsoldTickets) {
			this.nmbrOFsoldTickets = nmbrOFsoldTickets;
		}
		public ArrayList<Passanger> getPassangers() {
			return passangers;
		}
		public void setPassangers(ArrayList<Passanger> passangers) {
			this.passangers = passangers;
		}
		public String getTakeOffTime() {
			return takeOffTime;
		}
		public void setTakeOffTime(String takeOffTime) {
			this.takeOffTime = takeOffTime;
		}
		public String getFlightPrice() {
			return flightPrice;
		}
		public void setFlightPrice(String flightPrice) {
			this.flightPrice = flightPrice;
		}
		public String getFlightFine() {
			return flightFine;
		}
		public void setFlightFine(String flightFine) {
			this.flightFine = flightFine;
		}
	    
	    
}
