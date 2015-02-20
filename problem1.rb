def get_multiples(num, max)
	multiples_list = []
	1.upto(max) do |i|
		if i % num == 0
			multiples_list << i
		end
	end

	multiples_list
end

multiples = get_multiples(3, 1000-1) + get_multiples(5, 1000-1)

sum = 0
multiples.uniq!
multiples.each { |i| sum += i }

puts sum
