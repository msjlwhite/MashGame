# Creating Abstract Class Test
class UsrResponse
    # attr_accessor -- creates a getter and setter for a variable
    attr_accessor :spouse, :career, :income, :city, :numOfKids, :carMake, :carBodyStyle

    # initializes class object
    def initialize
       puts "Generating user questions and . . . possible romantic FUTURE!!"
    end  

end #

# Testing to ensure that the 'initialize' method works.
user = UsrResponse.new

# creates new UsrResponse object called user
puts user

# creates an array to hold user input
# options = Array.new(4)
#     options << o
# end

# total = [0,1,2,3]
# total.each do |x|
#    puts total << x + 1
# end

# print total

# prints out the following message to get user input
# for input in options
#     print "Please enter the name of someone you like: "
#     # user.spouse = gets.chomp
#     options << (gets.chomp)
# end

# puts options
# puts "You entered " + user.spouse
