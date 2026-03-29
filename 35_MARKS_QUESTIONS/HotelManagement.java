import java.util.*;

class Hotel {

    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;
    private static HashSet<Integer> st = new HashSet<>();

    Hotel(int hotelId, String hotelName, String dateOfBooking,
            int noOfRoomsBooked, String cabFacility, double totalBill) {

        if (st.contains(hotelId)) {
            throw new IllegalArgumentException("Duplicate Hotel ID!");
        }
        st.add(hotelId);

        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;

    }

    int getHotelId() {
        return hotelId;
    }

    void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    String getHotelName() {
        return hotelName;
    }

    void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    String getDateOfBooking() {
        return dateOfBooking;
    }

    void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    String getCabFacility() {
        return cabFacility;
    }

    void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    double getTotalBill() {
        return totalBill;
    }

    void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

public class HotelManagement {

    public int totalNoOfRoomsBooked(Hotel[] arr, String cf) {
        int cnt = 0;
        for (Hotel h : arr) {
            if (h.getCabFacility().equals(cf) && h.getNoOfRoomsBooked() > 5) {
                cnt += h.getNoOfRoomsBooked();
            }
        }
        return cnt > 0 ? cnt : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hotel[] arr = new Hotel[n];
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();
            sc.nextLine();
            arr[i] = new Hotel(a, b, c, d, e, f);

        }
        String s = sc.nextLine();
        HotelManagement hm = new HotelManagement();
        int ans = hm.totalNoOfRoomsBooked(arr, s);
        if (ans > 0) {
            System.out.println(ans);
        }

    }
}
