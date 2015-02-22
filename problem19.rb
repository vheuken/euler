require 'date'

num_of_sundays = 0

1901.upto(2000) do |year|
	1.upto(12) do |month|
		if Date.new(year, month, 1).sunday?
			num_of_sundays += 1
		end
	end
end

puts num_of_sundays
