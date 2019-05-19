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
# puts user.initialize

# Strings to hold questions for user response
spouse = "the name of someone you like: "
career = "the name of your future dream job: "
income = "how much would like to make a year: "
city = "the name of the city that you would to call home in the future: "
numOfKids = "how many children do you think you may have in the future: "
carMake = "the make of you would like (ex. Mercedes): "
carBodyStyle = "the car body style you would like (ex. SUV or sedan): "

# creates an array to hold user input
def play_a_round(question)
    answers = []
    # creates a loop and a count to control how many times the loop will execute
    4.times do
        print "Enter the " + question
        answers << gets.chomp.upcase
    end
    answers[rand(4)] #<---WORKING!!!
end

puts "Hello, Fortune Seeker, welcome to M.A.S.H. Romantic Future Predictor."
print "Please enter your name: "
name = gets.chomp.upcase

puts "Welcome " + name + "."
puts ""

puts "Please enter the information requested below so that I can get a better idea of what your future love life may hold."
puts "You will be asked each question 4 times, meaning you can enter 4 options."
puts""

# 
homeOpt = ["MANSION","APARTMENT","SHACK","HOUSE"]
housing = homeOpt[rand(4)]

user.spouse = play_a_round(spouse)
user.career = play_a_round(career)
user.income = play_a_round(income)
user.city = play_a_round(city)
user.numOfKids = play_a_round(numOfKids)
user.carMake = play_a_round(carMake)
user.carBodyStyle = play_a_round(carBodyStyle)

puts ""
puts name + ", the stars have revealed to me your future and it is as follows: " 
puts "In the future . . . ."

puts "You will marry: " + user.spouse.to_s
puts "You will be working as a: " + user.career.to_s
puts "You will make " + user.income.to_s + " a year."
puts "You will live in " + user.city.to_s
puts "You will have " + user.numOfKids.to_s + " kids."
puts "You will drive a " + user.carMake.to_s + " " + user.carBodyStyle.to_s + "."
puts "You will live in a " + housing.to_s + '.'