package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bpodgursky.jbool_expressions.*;
import com.bpodgursky.jbool_expressions.parsers.ExprParser;
import com.bpodgursky.jbool_expressions.rules.RuleSet;
import com.bpodgursky.jbool_expressions.eval.*;

@Path("/Proplog")
public class Proplog {

	@GET
	@Path("/{sentence}")
	@Produces("text/plain")
	public Expression<String> get(@PathParam("sentence") String sentence) {
		return RuleSet.simplify(ExprParser.parse(sentence));
	}

}