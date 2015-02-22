MAX_NUM = 20

def divisible?(num, divisor)
	num % divisor == 0
end

found = false
n = MAX_NUM-2

until found do
	n = n + 2

	(1..MAX_NUM).each do |i|
		if !divisible?(n, i)
			break
		elsif i == MAX_NUM
			found = true
		end
	end
end

puts n
