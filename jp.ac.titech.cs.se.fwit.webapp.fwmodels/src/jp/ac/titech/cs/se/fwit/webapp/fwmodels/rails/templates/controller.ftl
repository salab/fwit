class ${className} < ActionController::Base
	<#list methodStatements?keys as method>
	def ${method}
		<#list methodStatements[method] as statement >
		# ${statement}
		</#list>
	end
	</#list>
end