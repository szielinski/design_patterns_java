Purpose: Adapt an existing interface to fit the requirements of a new system without changing the original code.

Achieved by nesting instances of legacy objects behind an interface suitable for the new system using composition. Method invocations on the adapter are usually delegated to the nested legacy object with all required translations happening in the adapter before the result is returned.
