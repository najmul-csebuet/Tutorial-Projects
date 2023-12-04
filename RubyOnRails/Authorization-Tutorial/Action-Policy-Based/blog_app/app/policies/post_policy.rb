class PostPolicy < ApplicationPolicy
  def show?
    true
  end

  # Quick tip: Action Policy can reference the current_user provided by Devise
  # and assign it to a user within the policy.
  def update?
    # post can only be updated by an author role or the post's author
    user.author? || (user.id == record.user_id)
  end

  def destroy
    # a post can only be deleted by its author
    user.id == record.user_id
  end
end
